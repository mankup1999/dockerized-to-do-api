package com.manku.todo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.manku.todo.model.Todo;

public interface Repo extends JpaRepository<Todo, Integer> {

}
