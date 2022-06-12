package com.sarthak.demo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sarthak.demo.models.Todo;

@Repository
public interface TodoRepository extends CrudRepository<Todo, Integer> {
    
}
