package com.sarthak.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sarthak.model.Todo;

@CrossOrigin(origins="http://localhost:4200")
@RestController
public class TodoController {

	@Autowired
	private TodoService todoService;


	@GetMapping(value = "/getTodos")
	public List<Todo> getAllTodos() {
		return todoService.getAllTodos();
	}
	
}
