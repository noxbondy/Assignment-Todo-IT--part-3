package test;

import management.Person;
import management.TodoItem;
import management.TodoItemTask;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.*;

class TodoItemTaskTest {

    @Test
    void getIdShouldReturnZero() {
        TodoItem todoItem = new TodoItem(20, "food", "food shop", LocalDate.now().plusMonths(2));
        TodoItemTask todoItemTask = new TodoItemTask(todoItem, false);
        assertEquals(0,todoItemTask.getId());
    }

    @Test
    void notSettingAssigneeShouldReturnNull() {
        TodoItem todoItem = new TodoItem(20, "food", "food shop", LocalDate.now().plusMonths(2));
        TodoItemTask todoItemTask = new TodoItemTask(todoItem,false);
        assertFalse(todoItemTask.isAssigned());

    }


    @Test
    void assignToNullShouldReturnFalseOnIsAssigned() {
        TodoItem todoItem = new TodoItem(20,"food","food shop", LocalDate.now().plusMonths(2));
        TodoItemTask todoItemTask = new TodoItemTask(todoItem,false);
        Person botond = new Person(20,"noxbondy", "noxbondy@gmail.com");
        todoItemTask.setAssignee(botond);
        todoItemTask.setAssignee(null);
        assertFalse(todoItemTask.isAssigned());
    }


    @Test
    void settingAssigneeToPersonMelhemFromPersonNoxbondy() {
        TodoItem todoItem = new TodoItem(20,"food","food shop", LocalDate.now().plusMonths(2));
        Person botond = new Person(20,"Noxbondy", "gulamnoxbondy@gmail.com");
        Person melhem = new Person(30,"nour ", "nourel@gmail.com");
        TodoItemTask todoItemTask = new TodoItemTask(todoItem,false);
        boolean isAssigned = TodoItemTask.isAssigned;

    }



    void getSummaryListsAllFields() {
        TodoItem todoItem = new TodoItem(20, "food", "food shop", LocalDate.now().plusMonths(2));
        TodoItemTask todoItemTask = new TodoItemTask(todoItem, false);
        assertEquals("ID: 0" +
                        "\nIs assigned: false" +
                        "\nTodo item: " + todoItemTask.getTodoItem() +
                        "\nAssignee: null",
                todoItemTask.toString());
    }
}