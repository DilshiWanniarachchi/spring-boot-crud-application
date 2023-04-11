package in.restproject.springbootmongodb.service;

import java.util.List;

import in.restproject.springbootmongodb.exception.TodoCollectionException;
import in.restproject.springbootmongodb.model.TodoDTO;
import jakarta.validation.ConstraintViolationException;

public interface TodoService {
    public void createTodo(TodoDTO todo) throws ConstraintViolationException, TodoCollectionException; 
    public List<TodoDTO> getAllTodos();
    public TodoDTO getSingleTodo(String id) throws TodoCollectionException;
    public void updateTodo(String id,TodoDTO todo) throws TodoCollectionException;
    public void deleteTodoById(String id) throws TodoCollectionException;
}
