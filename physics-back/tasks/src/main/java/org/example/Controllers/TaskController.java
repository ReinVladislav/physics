package org.example.Controllers;

import org.example.data.Task18;
import org.example.dto.Task18Dto;
import org.example.services.Task18Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@Controller
@RequestMapping("/task")
@CrossOrigin
public class TaskController {
    private final Task18Service task18Service;
    private final

    @Autowired
    public TaskController(Task18Service task18Service) {
        this.task18Service = task18Service;
    }

    @PostMapping("/save/task18")
    public ResponseEntity<String> saveTask18(@RequestBody Task18Dto task18Dto){
        task18Service.save(new Task18(task18Dto));
        return new ResponseEntity<>(HttpStatus.valueOf(200));
    }



}
