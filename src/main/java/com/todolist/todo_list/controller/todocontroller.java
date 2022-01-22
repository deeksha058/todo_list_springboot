package com.todolist.todo_list.controller;


import com.todolist.todo_list.model.TodoList;
import com.todolist.todo_list.rpo.todorepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/todo")
public class todocontroller {

    @Autowired
    private todorepo todorepo;

    @GetMapping
    public List<TodoList> findAll(){
        return todorepo.findAll();
    }

    @PostMapping
    public TodoList save(@Validated @NonNull @RequestBody TodoList todoList){
        return todorepo.save(todoList);
    }

    @PutMapping(value = "/{id}")
    public TodoList update(@Validated @NonNull @RequestBody TodoList todoList ){
        return todorepo.save(todoList);
    }



    @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable Long id){
        todorepo.deleteById(id);
    }
}
