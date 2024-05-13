package com.example.ToDoList.service;

import com.example.ToDoList.entity.ToDo;

import java.util.List;

public interface ToDoService {
    List <ToDo> getAllToDo();

    void saveToDo(ToDo todo);

    void updateToDo(Long id, ToDo todo);

    ToDo getTodoById(Long id);

    void deleteTodo(Long id);
}
