package management;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TodoItemDAO implements iTodoItemDAO{
    private List<TodoItem>todoItems= new ArrayList<>();

    // override method


    @Override
    public void persist(TodoItem todoItem) {
        todoItems.add(todoItem);
    }

    @Override
    public TodoItem findById(int id) {
        return todoItems.stream().filter(item->item.getId()==id).findFirst().orElse(null);
    }

    @Override
    public List<TodoItem> findAll() {
        return new ArrayList<>(todoItems);
    }

    @Override
    public List<TodoItem> findAllByDoneStatus(boolean isDone) {
        return todoItems.stream().filter(item->item.isDone()==isDone).collect(Collectors.toList());
    }

    @Override
    public List<TodoItem> findTitleContains(String title) {
        return todoItems.stream().filter(item->item.getTitle().toLowerCase().contains(title.toLowerCase())).collect(Collectors.toList());
    }

    @Override
    public List<TodoItem> findByPersonId(int personId) {
        return todoItems.stream().filter(item->item.getCreatorId()==personId).collect(Collectors.toList());
    }

    @Override
    public List<TodoItem> findByDeadlineBefore(LocalDate date) {
        return todoItems.stream().filter(item->item.getDueDate().isBefore(date)).collect(Collectors.toList());
    }

    @Override
    public List<TodoItem> findByDeadlineAfter(LocalDate date) {
        return todoItems.stream().filter(item->item.getDueDate().isAfter(date)).collect(Collectors.toList());
    }

    @Override
    public void remove(int id) {
        todoItems.removeIf(item->item.getId()==id);
    }
}
