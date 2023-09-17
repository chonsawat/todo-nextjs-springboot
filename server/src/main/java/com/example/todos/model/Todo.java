package com.example.todos.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "todos_spring_info")
public class Todo {
  @Id
  private String todoId;
  private String todoTitle;
  private String todoStatus;

  public Todo(String todoId, String todoTitle, String todoStatus) {
    this.todoId = todoId;
    this.todoTitle = todoTitle;
    this.todoStatus = todoStatus;
  }

  public String getTodoId() {
    return this.todoId;
  }

  public void setTodoId(String todoId) {
    this.todoId = todoId;
  }

  public String getTodoTitle() {
    return this.todoTitle;
  }

  public void setTodoTitle(String todoTitle) {
    this.todoTitle = todoTitle;
  }

  public String getTodoStatus() {
    return this.todoStatus;
  }

  public void setTodoStatus(String todoStatus) {
    this.todoStatus = todoStatus;
  }

}