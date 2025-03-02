package management;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Main {
    public static void main(String[] args) {
        PersonDAO personDAO = new PersonDAO();

        Person p1 = new Person(20,"Nour", "nourel@gamil.com");
        Person p2 = new Person(30,"nox", "noxbondy@gmail.com");

        personDAO.persist(p1);
        personDAO.persist(p2);

        System.out.println("All People:");
        personDAO.findAll().forEach(System.out::println);

        System.out.println("Find by ID 1: " + personDAO.findById(20));
        System.out.println("Find by Email (noxbondy@gmail.com): " + personDAO.findByEmail("noxbondy@gmail.com"));

        personDAO.remove(20);
        System.out.println("After Removing ID 1:");
        personDAO.findAll().forEach(System.out::println);


        iAppUserDAO appUser=new AppUserDAO();
// adding user
        appUser.persist(new AppUser(20,"noxbondy","nour@gmailcom","tayar","password",AppRole.USER));
        appUser.persist(new AppUser(30,"nox","noxbondy@gamil.com","nox","password",AppRole.ADMIN));

        //Finding user

        System.out.println("find noxbondy"+appUser.findByUsername("noxbondy"));

        //Listing all user

        System.out.println("list all user"+appUser.findAll());

        // removing user
        appUser.remove("noxbondy");
        System.out.println("all user after remove"+appUser.findAll());

        // todoitem

        iTodoItemDAO iTodoItemDAO =new TodoItemDAO();
        TodoItem item1 =new TodoItem(2,"computer","computer shop",LocalDate.of(2025,02,5));
        TodoItem item2 =new TodoItem(3, "grocary","grocary shop",LocalDate.of(2025,02,15));
        TodoItem item3 =new TodoItem(4,"cake","cake shop",LocalDate.of(2025,02,20));

        // persis item
        iTodoItemDAO.persist(item1);
        iTodoItemDAO.persist(item2);
        iTodoItemDAO.persist(item3);

        //find by id
        System.out.println("find by id 1");
        System.out.println(iTodoItemDAO.findById(1));


        // find by all
        System.out.println("find by all");
        iTodoItemDAO.findAll().forEach(System.out::println);
        // find by done by status

        System.out.println("find by done by status");
        iTodoItemDAO.findAllByDoneStatus(false).forEach(System.out::println);

        // todoItemtask

        TodoItemTaskDAO taskDAO = new TodoItemTaskDAO();
        TodoItem todoItem = new TodoItem(20, "food", "food shop", LocalDate.now().plusMonths(2));
        TodoItemTask todoItemTask = new TodoItemTask(todoItem, false);
        assertEquals(0,todoItemTask.getId());

        // Adding tasks
     taskDAO.persist(new TodoItemTask(item1,true));
     taskDAO.persist(new TodoItemTask(item2,true));
     taskDAO.persist(new TodoItemTask(item3,false));





        // Display all tasks
        System.out.println("All Tasks: " + taskDAO.findAll());

        // Find by ID
        System.out.println("Task with ID 2: " + taskDAO.findById(20));

        // Find by assigned status
        System.out.println("Assigned Tasks: " + taskDAO.findByAssignedStatus(false));

        // Find by Person ID
        System.out.println("Tasks assigned to Person 1: " + taskDAO.findByPersonId(30));

        // Remove a task
        taskDAO.remove(20);
        System.out.println("All Tasks after removal: " + taskDAO.findAll());

    }
}
