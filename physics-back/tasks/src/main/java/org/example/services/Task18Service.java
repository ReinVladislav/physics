package org.example.services;

import org.example.data.Task18;
import org.example.repositories.Task18Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class Task18Service{

    private final Task18Repository task18Repository;

    @Autowired
    public Task18Service(Task18Repository task18Repository) {
        this.task18Repository = task18Repository;
    }

    public void save(Task18 task18){
        task18Repository.save(task18);
    }

}
