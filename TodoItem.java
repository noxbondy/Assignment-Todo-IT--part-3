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


    public TodoItem(int id, String title, String description, int dueDate, boolean isDone, int creatorId) {
        this.id = id;
        this.title = title;
        this.description=description;
        this.dueDate = LocalDate.ofEpochDay(dueDate);
        this.isDone = isDone;
        this.creatorId = creatorId;
    }

    // get and set method


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
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
        this.dueDate = dueDate;
    }

    public boolean isDone() {
        return isDone;
    }

    public void setDone(boolean done) {
        isDone = done;
    }

    public int getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(int creatorId) {
        this.creatorId = creatorId;
    }

    @Override
    public String toString() {
        return "TodoItem{" +
                "creatorId=" + creatorId +
                ", id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", dueDate=" + dueDate +
                ", isDone=" + isDone +
                '}';
    }
}
