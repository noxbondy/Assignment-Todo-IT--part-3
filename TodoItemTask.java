package management;

public class TodoItemTask {
    private static int idCounter = 1;
    private final int id;
    private String taskDescription;
    private boolean assigned;
    private int personId;

    public TodoItemTask(String taskDescription, boolean assigned, int personId) {
        this.id = idCounter++;
        this.taskDescription = taskDescription;
        this.assigned = assigned;
        this.personId = personId;
    }

    public int getId() { return id; }
    public String getTaskDescription() { return taskDescription; }
    public boolean isAssigned() { return assigned; }
    public int getPersonId() { return personId; }

    @Override
    public String toString() {
        return "TodoItemTask{" + "id=" + id + ", taskDescription='" + taskDescription + '\'' + ", assigned=" + assigned + ", personId=" + personId + '}';
    }
}
