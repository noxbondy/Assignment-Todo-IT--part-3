package management;

public class TodoItemTaskIdSequencer {
   static int currentId ;

    public static int nextId() {
        return ++currentId;
    }

    public static int getCurrentId() {
        return currentId;
    }

    public static void setCurrentId(int currentId) {
        PersonIdSequencer.currentId =currentId;
    }
}
