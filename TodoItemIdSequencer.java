package management;

public class TodoItemIdSequencer {
    public static int currentId=0;

 public static  int nextId(){
     return ++currentId;
 }
 public static int getCurrentId(){
     return currentId;
 }
 public static void setCurrentId(int id){
     currentId=id;
 }
}
