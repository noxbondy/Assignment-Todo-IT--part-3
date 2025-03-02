package management;
import java.util.ArrayList;
import java.util.List;

public class PersonIdSequencer {
    static int currentId ;

    public static int nextId() {
        return ++currentId;
    }

    public static int getCurrentId() {
        return currentId;
    }

    public static void setCurrentId(int currentId) {
        PersonIdSequencer.currentId = currentId;
    }
}