package com.example.ToDoList.controller;


import com.example.ToDoList.entity.ToDo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.ToDoList.service.ToDoServiceImpl;

import java.util.List;

@RestController
@RequestMapping("api/v1/todo/")
public class ToDoController {

    @Autowired
    private ToDoServiceImpl toDoService;

    @GetMapping
    public List<ToDo> findAll(){
        return toDoService.getAllToDo();
    }

    @PostMapping
    public void save(@RequestBody ToDo todo){
        toDoService.saveToDo(todo);
    }

    @GetMapping("/{id}")
    public ToDo findOne(@PathVariable Long id){
        return toDoService.getTodoById(id);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable Long id, @RequestBody ToDo todo) {
        this.toDoService.updateToDo(id, todo);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        this.toDoService.deleteTodo(id);
    }


}
