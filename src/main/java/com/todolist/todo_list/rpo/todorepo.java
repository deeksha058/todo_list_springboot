package com.todolist.todo_list.rpo;

import com.todolist.todo_list.model.TodoList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface todorepo extends
        JpaRepository <TodoList, Long>{
}
