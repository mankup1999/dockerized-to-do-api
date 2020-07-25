package com.manku.todo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manku.todo.model.Todo;
import com.manku.todo.repo.Repo;

@Service
public class ServiceTodo {
	@Autowired
	Repo repo;

	public void createTodo(Todo todo) {
		repo.save(todo);
	}

	public List<Todo> showAllTodos() {
		return repo.findAll();
	}

	public Todo showTodo(int id) {
		Optional<Todo> opt = repo.findById(id);
		if (opt.isPresent())
			return opt.get();
		return null;
	}

	public Todo updateTodo(Todo todo, int id) {
		return repo.findById(id).map(todo1 -> {
			todo1.setId(todo.getId());
			todo1.setTasks(todo.getTasks());
			return repo.save(todo1);
		}).orElseGet(() -> {
			todo.setId(id);
			return repo.save(todo);
		});
	}

	public void deleteTodo(int id) {
		repo.deleteById(id);
	}

}
