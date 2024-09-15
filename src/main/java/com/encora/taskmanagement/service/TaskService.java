package com.encora.taskmanagement.service;

import com.encora.taskmanagement.domain.Task;
import com.encora.taskmanagement.model.SearchTasksRequest;
import com.encora.taskmanagement.model.TaskStatus;
import com.encora.taskmanagement.repository.TaskRepository;
import jakarta.validation.constraints.NotNull;
import java.time.OffsetDateTime;
import java.util.List;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.support.PageableExecutionUtils;
import org.springframework.stereotype.Service;

/** The task service. */
@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
@Slf4j
public class TaskService {
  private final TaskRepository taskRepository;
  private final MongoTemplate mongoTemplate;

  public Page<Task> search(@NotNull SearchTasksRequest searchTasksRequest) {
    final Criteria criteria = new Criteria();
    final String titleVal = StringUtils.trimToEmpty(searchTasksRequest.getTitle());
    if (StringUtils.isNotEmpty(titleVal)) {
      criteria.and("title").regex(".*" + titleVal + ".*", "i");
    }

    final List<TaskStatus> status = searchTasksRequest.getStatus();
    if (status != null) {
      status.removeIf(item -> item == null || item == TaskStatus.UNKNOWN_DEFAULT_OPEN_API);
      if (!status.isEmpty()) {
        criteria.and("status").in(status);
      }
    }
    final OffsetDateTime dueDateFrom = searchTasksRequest.getDueDateFrom();
    final OffsetDateTime dueDateTo = searchTasksRequest.getDueDateTo();
    if (dueDateFrom != null && dueDateTo != null) {
      criteria.and("dueDate").in(dueDateFrom, dueDateTo);
    } else if (dueDateFrom != null) {
      criteria.and("dueDate").gt(dueDateFrom);
    } else {
      criteria.and("dueDate").lt(dueDateTo);
    }

    final Pageable pageable =
        PageRequest.of(searchTasksRequest.getPage(), searchTasksRequest.getSize());
    final Query query =
        new Query(criteria)
            .with(pageable)
            .with(Sort.by(searchTasksRequest.getSort().toArray(new String[0])));
    final List<Task> tasks = mongoTemplate.find(query, Task.class);
    return PageableExecutionUtils.getPage(
        tasks, pageable, () -> mongoTemplate.count(Query.of(query).limit(-1).skip(-1), Task.class));
  }
}
