package com.encora.taskmanagement.controller;

import com.encora.taskmanagement.api.TasksApi;
import com.encora.taskmanagement.domain.Task;
import com.encora.taskmanagement.model.SearchTasksRequest;
import com.encora.taskmanagement.model.SearchTasksResponse;
import com.encora.taskmanagement.model.SearchTasksResponseContentInner;
import com.encora.taskmanagement.model.SearchTasksResponseInner;
import com.encora.taskmanagement.service.TaskService;

import java.util.ArrayList;
import java.util.List;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/task-management-service/v1/tasks")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
@Slf4j
public class TaskController implements TasksApi {
  private final TaskService taskService;

  @Override
  public ResponseEntity<SearchTasksResponse> searchTasks(SearchTasksRequest searchTasksRequest) {
    final Page<Task> search = taskService.search(searchTasksRequest);
    SearchTasksResponse response = new SearchTasksResponse();
    final ArrayList<SearchTasksResponseContentInner> content = new ArrayList<>();
    for (Task task : search) {
      SearchTasksResponseContentInner item = new SearchTasksResponseContentInner();
      item.setTitle(task.getTitle());
      content.add(item);
    }
    response.content(content);
    response.setPage(search.getNumber());
    response.setEmpty(search.isEmpty());
    response.setFirst(search.isFirst());
    response.setLast(search.isLast());
    response.setNumberOfElements(search.getNumberOfElements());
    response.setTotalPages(search.getTotalPages());
    response.setTotalElements((int) search.getTotalElements());
    return ResponseEntity.ok(response);
  }
}
