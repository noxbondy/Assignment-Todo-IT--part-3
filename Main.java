package management;

public class Main {
    public static void main(String[] args) {
        PersonDAO personDAO = new PersonDAO();

        Person p1 = new Person(20,"Alice", "alice@example.com");
        Person p2 = new Person(30,"Bob", "bob@example.com");

        personDAO.persist(p1);
        personDAO.persist(p2);

        System.out.println("All People:");
        personDAO.findAll().forEach(System.out::println);

        System.out.println("Find by ID 1: " + personDAO.findById(1));
        System.out.println("Find by Email (bob@example.com): " + personDAO.findByEmail("bob@example.com"));

        personDAO.remove(1);
        System.out.println("After Removing ID 1:");
        personDAO.findAll().forEach(System.out::println);


        iAppUserDAO appUser=new AppUserDAO();
// adding user
        appUser.persist(new AppUser("noxbondy","pass12345"));
        appUser.persist(new AppUser("nour","nou123456"));

        //Finding user

        System.out.println("find noxbondy"+appUser.findByUsername("noxbondy"));

        //Listing all user

        System.out.println("list all user"+appUser.findAll());

        // removing user
        appUser.remove("noxbondy");
        System.out.println("all user after remove"+appUser.findAll());

        // todoitem

        iTodoItemDAO iTodoItemDAO =new TodoItemDAO();
        TodoItem item1 =new TodoItem(20,"sweets","one box sweets",10,false,10);
        TodoItem item2 =new TodoItem(30,"computer","set of computer",25,true,15);
        TodoItem item3 =new TodoItem(25,"pen","pacek of pern",9,true,3);

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
        iTodoItemDAO.findAllByDoneStatus(true).forEach(System.out::println);

        // todoItemtask

        TodoItemTaskDAO taskDAO = new TodoItemTaskDAO();

        // Adding tasks
        taskDAO.persist(new TodoItemTask("Buy groceries", true, 1));
        taskDAO.persist(new TodoItemTask("Pay bills", false, 2));
        taskDAO.persist(new TodoItemTask("Clean house", true, 1));

        // Display all tasks
        System.out.println("All Tasks: " + taskDAO.findAll());

        // Find by ID
        System.out.println("Task with ID 2: " + taskDAO.findById(2));

        // Find by assigned status
        System.out.println("Assigned Tasks: " + taskDAO.findByAssignedStatus(true));

        // Find by Person ID
        System.out.println("Tasks assigned to Person 1: " + taskDAO.findByPersonId(1));

        // Remove a task
        taskDAO.remove(2);
        System.out.println("All Tasks after removal: " + taskDAO.findAll());
    }
}
