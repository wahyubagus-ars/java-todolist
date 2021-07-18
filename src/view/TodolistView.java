package view;

import service.TodolistService;
import util.InputUtil;

public class TodolistView {

    private TodolistService todolistService;

    public TodolistView(TodolistService todolistService) {
        this.todolistService = todolistService;
    }

    public void showTodolist(){
        while (true) {
            todolistService.showTodolist();

            System.out.println("MENU : ");
            System.out.println("1. Tambah");
            System.out.println("2. Hapus");
            System.out.println("x. Keluar");

            var input = InputUtil.input("Pilih");

            if (input.equals("1")) {
                addTodolist();
            } else if (input.equals("2")) {
                removeTodolist();
            } else if (input.equals("x")) {
                break;
            } else {
                System.out.println("Pilihan tidak dimengerti");
            }
        }
    }

    public void addTodolist(){
        System.out.println("MENAMBAH TODOLIST");

        var todo = InputUtil.input("Todo (x Jika Batal)");

        if (todo.equals("x")) {
            // batal
        } else {
            todolistService.addTodolist(todo);
        }
    }

    public void removeTodolist(){
        System.out.println("MENGHAPUS TODOLIST");

        var number = InputUtil.input("Nomor yang Dihapus (x Jika Batal)");

        if (number.equals("x")) {
            // batal
        } else {
            todolistService.removeTodolist(Integer.valueOf(number));
        }
    }

}
