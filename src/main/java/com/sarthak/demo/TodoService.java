package com.sarthak.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.sarthak.demo.models.Todo;

@Service
public class TodoService {

	@Autowired
	TodoRepository todoRepository;
	// private List<Todo> todos = new ArrayList<>(Arrays.asList(
	// new Todo("1","Angular Course from Coursera",false,new Date()),
	// new Todo("2","Tic Tac Toe using Angular",false,new Date()),
	// new Todo("2","Tic Tac Toe using Angular",false,new Date())
	// ));
	
	public List<Todo> getAllTodos() {
		 List<Todo> todos = new ArrayList<Todo>();
		todoRepository.findAll().forEach(todos::add);
		return todos;
	}

	public void addTodo(Todo todo) {
		todoRepository.save(todo);
		
	}

}
