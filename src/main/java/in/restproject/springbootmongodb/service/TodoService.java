package in.restproject.springbootmongodb.service;

import java.util.List;

import in.restproject.springbootmongodb.exception.TodoCollectionException;
import in.restproject.springbootmongodb.model.TodoDTO;
import jakarta.validation.ConstraintViolationException;

public interface TodoService {
    public List<TodoDTO> getAllTodos();
    public void createTodo(TodoDTO todo) throws ConstraintViolationException, TodoCollectionException; 
}
