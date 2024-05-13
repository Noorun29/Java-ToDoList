package com.example.ToDoList.entity;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;

import java.sql.Timestamp;

@Getter
@Setter
@Entity
public class ToDo {
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    private Long id;

    @NonNull
    private String taskName;

    @NonNull
    private String description;

    @CreatedDate
    Timestamp dateCreated;



}
