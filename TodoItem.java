package management;
import java.time.LocalDate;

public class TodoItem {
    private int id;
    private String title;
    private String description;
    private  LocalDate dueDate;
    private boolean isDone;
    private  int creatorId;


    //  constructor

    public TodoItem(int creatorId, String title,String description, LocalDate dueDate) {
        setTitle(title);
        setDescription(description);
       setDueDate(dueDate);
       setCreatorId(creatorId);
        setId(id);
    }


    // get and set method


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = TodoItemIdSequencer.nextId();
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (title.trim().isEmpty()){
            throw new IllegalArgumentException("title is missing");
        }
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        if (dueDate==null){
            throw new IllegalArgumentException("task due date missing");
        }
        this.dueDate = dueDate;
    }

    public boolean isDone() {
        return isDone;
    }

    public void setDone(boolean done) {
        isDone = done;
    }

    public void setCreatorId(int creatorId) {
        this.creatorId = creatorId;
    }

    public int getCreatorId() {
        return 0;
    }

    @Override
    public String toString() {
        return "TodoItem{" +
                "id=" + id +
                ", creatorId=" + creatorId +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", dueDate=" + dueDate +
                ", isDone=" + isDone +
                '}';
    }
}
