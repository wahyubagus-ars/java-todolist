package test.service;

import entity.Todolist;
import repository.TodolistRepository;
import repository.TodolistRepositoryImpl;
import service.TodolistService;
import service.TodolistServiceImpl;

public class TodolistServiceTest {
    public static void main(String[] args) {
        testRemoveTodolist();
    }

    public static void testShowTodolist(){
        TodolistRepositoryImpl todolistRepository = new TodolistRepositoryImpl();

        todolistRepository.data[0] = new Todolist("belajar java 1");
        todolistRepository.data[1] = new Todolist("belajar java 2");
        todolistRepository.data[2] = new Todolist("belajar java 3");

        TodolistService todolistService = new TodolistServiceImpl(todolistRepository);

        todolistService.showTodolist();
    }

    public static void testAddTodolist(){
        TodolistRepositoryImpl todolistRepository = new TodolistRepositoryImpl();

        TodolistService todolistService = new TodolistServiceImpl(todolistRepository);

        todolistService.addTodolist("Belajar java dasar");
        todolistService.addTodolist("Belajar java oop");
        todolistService.addTodolist("Belajar java android");

        todolistService.showTodolist();
    }

    public static void testRemoveTodolist(){
        TodolistRepository todolistRepository = new TodolistRepositoryImpl();
        TodolistService todolistService = new TodolistServiceImpl(todolistRepository);

        todolistService.addTodolist("Belajar java dasar");
        todolistService.addTodolist("Belajar java oop");
        todolistService.addTodolist("Belajar java android");

        todolistService.removeTodolist(1);

        todolistService.showTodolist();
    }
}
