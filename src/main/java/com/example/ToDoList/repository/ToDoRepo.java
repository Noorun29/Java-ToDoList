package com.example.ToDoList.repository;

import com.example.ToDoList.entity.ToDo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ToDoRepo extends JpaRepository<ToDo , Long> {
}
