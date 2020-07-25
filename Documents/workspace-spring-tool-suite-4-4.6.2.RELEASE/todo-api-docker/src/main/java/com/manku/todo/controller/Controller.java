package com.manku.todo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.manku.todo.model.Todo;
import com.manku.todo.service.ServiceTodo;

@RestController
@RequestMapping("/")
public class Controller {

	@Autowired
	ServiceTodo service;
	
	@GetMapping("todos")
	public List<Todo> readAll() {
		return service.showAllTodos();
	}
	
	@GetMapping("todos/{id}")
	public Todo readById(@PathVariable int id) {
		return service.showTodo(id);
	}
	
	@PostMapping("todos")
	public void create(@RequestBody Todo todo) {
		service.createTodo(todo);
	}
	
	@PutMapping("todos/{id}")
	public Todo update(@RequestBody Todo todo, @PathVariable int id) {
		return service.updateTodo(todo, id);
	}
	
	@DeleteMapping("todos/{id}")
	public void delete(@PathVariable int id) {
		service.deleteTodo(id);
	}
	
	
}
