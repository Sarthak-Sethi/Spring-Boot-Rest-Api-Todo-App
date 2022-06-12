package com.sarthak.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sarthak.demo.models.Todo;

@CrossOrigin(origins="http://localhost:4200")
@RestController
public class TodoController {

	@Autowired
	private TodoService todoService;


	@GetMapping(value = "/getTodos")
	public List<Todo> getAllTodos() {
		return todoService.getAllTodos();
	}

	@PostMapping(value="/todos")
	    public ResponseEntity<Todo> addTodo(@RequestBody Todo todo  ) {
	        todoService.addTodo(todo);
			return new ResponseEntity<Todo>(todo,HttpStatus.OK);
	    }

	
}
