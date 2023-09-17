package com.example.todos.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/todos")
public class TodoContoller {

  @GetMapping
  public String getAllTodos() {
    return "Successfully";
  }
}
