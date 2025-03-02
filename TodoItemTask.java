package management;

public class TodoItemTask {
    public static boolean isAssigned;
    private  int id;
    private  Person assignee;
   private boolean assigned;
   private TodoItem todoItem;


   // Cnostrustor--

    public TodoItemTask(TodoItem todoItem, boolean assigned) {
        this.todoItem = todoItem;
        this.assigned = assigned;
    }


    // Getter

    public int getId() {
        return id;
    }

  public void setId(int id) {
        this.id = TodoItemTaskIdSequencer.nextId();
    }

    public Person getAssignee() {
        return assignee;
    }

    public TodoItem getTodoItem() {
        return todoItem;
    }
    // Setter


    public void setAssigned() {

        if (getAssignee() != null) {
            this.assigned = true;
            return;
        }
        this.assigned = false;
    }

    public void setTodoItem(TodoItem todoItem) {
        if (todoItem==null){
            throw  new IllegalArgumentException("todo item is missing ");
        }
        this.todoItem = todoItem;
    }

    public void setAssignee(Person assignee) {
        this.assignee = assignee;
    }

    public boolean isAssigned() {
        return  false;
    }


    public int getPersonId() {
        return 0;
    }

}
