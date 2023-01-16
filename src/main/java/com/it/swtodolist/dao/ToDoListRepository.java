package com.it.swtodolist.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.it.swtodolist.entities.ToDoList;

public interface ToDoListRepository extends JpaRepository<ToDoList, Long> {

}
