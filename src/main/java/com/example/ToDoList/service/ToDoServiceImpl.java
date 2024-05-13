package com.example.ToDoList.service;

import com.example.ToDoList.entity.ToDo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.ToDoList.repository.ToDoRepo;

import java.util.List;
import java.util.Optional;

//Annotation used to specify a service
@Service
public class ToDoServiceImpl implements  ToDoService {

    @Autowired
    private ToDoRepo toDoRepo;


    @Override
    public List<ToDo> getAllToDo() {
        return toDoRepo.findAll();
    }

    @Override
    public void saveToDo(ToDo todo) {
        this.toDoRepo.save(todo);

    }

   @Override
    public void updateToDo(Long id, ToDo todo) {
        ToDo todoFromDb = toDoRepo.findById(id).get();
        todoFromDb.setTaskName(todo.getTaskName());
        todoFromDb.setDescription(todo.getDescription());
        toDoRepo.save(todoFromDb);
    }


    @Override
    public ToDo getTodoById(Long id) {
        Optional<ToDo> optional = toDoRepo.findById(id);
        ToDo todo;
        if (optional.isPresent()){
            todo = optional.get();
        }
        else {
            throw  new RuntimeException("Todo for the id" + id + "is not found");
        }

        return todo;
    }



    @Override
    public void deleteTodo(Long id){
        this.toDoRepo.deleteById(id);

    }
}
