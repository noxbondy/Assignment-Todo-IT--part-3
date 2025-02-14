package management;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TodoItemTaskDAO implements iTodoItemTask {
    private final List<TodoItemTask> tasks = new ArrayList<>();

    @Override
    public void persist(TodoItemTask task) {
        tasks.add(task);
    }

    @Override
    public TodoItemTask findById(int id) {
        return tasks.stream().filter(t -> t.getId() == id).findFirst().orElse(null);
    }

    @Override
    public List<TodoItemTask> findAll() {
        return new ArrayList<>(tasks);
    }

    @Override
    public List<TodoItemTask> findByAssignedStatus(boolean status) {
        List<TodoItemTask> result = new ArrayList<>();
        for (TodoItemTask task : tasks) {
            if (task.isAssigned() == status) {
                result.add(task);
            }
        }
        return result;
    }

    @Override
    public List<TodoItemTask> findByPersonId(int personId) {
        List<TodoItemTask> result = new ArrayList<>();
        for (TodoItemTask task : tasks) {
            if (task.getPersonId() == personId) {
                result.add(task);
            }
        }
        return result;
    }

    @Override
    public void remove(int id) {
        tasks.removeIf(task -> task.getId() == id);
    }
}
