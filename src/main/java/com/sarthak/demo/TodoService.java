package com.sarthak.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.sarthak.model.Todo;

@Service
public class TodoService {
	private List<Todo> todos = new ArrayList<>(Arrays.asList(
			new Todo("1","Angular Course from Coursera",false,new Date()),
			new Todo("2","Tic Tac Toe using Angular",false,new Date()),
			new Todo("2","Tic Tac Toe using Angular",false,new Date())
		));

	public List<Todo> getAllTodos() {
		return this.todos;
		}
}
