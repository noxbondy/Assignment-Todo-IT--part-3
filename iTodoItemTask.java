package management;
import java.util.*;

public interface iTodoItemTask {
    void persist(TodoItemTask task);
    TodoItemTask findById(int id);
    List<TodoItemTask> findAll();
    List<TodoItemTask> findByAssignedStatus(boolean status);
    List<TodoItemTask> findByPersonId(int personId);
    void remove(int id);
}
