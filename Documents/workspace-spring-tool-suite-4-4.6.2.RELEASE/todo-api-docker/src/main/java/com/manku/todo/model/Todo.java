package com.manku.todo.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "todos_docker")
public class Todo {
	@Id
	private int id;
	@ElementCollection
	private List<String> tasks = new ArrayList<String>();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<String> getTasks() {
		return tasks;
	}

	public void setTasks(List<String> tasks) {
		this.tasks = tasks;
	}

}
