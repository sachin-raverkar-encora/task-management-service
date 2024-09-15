package com.encora.taskmanagement.domain;

import com.encora.taskmanagement.model.TaskStatus;
import jakarta.annotation.Nullable;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "tasks")
@Getter
@Setter
public class Task {
  @Id private String id;

  @NotBlank(message = "Title should be provided.")
  private String title;

  @Nullable private String description;

  @NotNull(message = "Due date should be provided.")
  private LocalDateTime dueDate;

  @NotNull(message = "Status should be provided.")
  private TaskStatus status;

  @NotNull(message = "Assignee should be provided.")
  private User assignee;
}
