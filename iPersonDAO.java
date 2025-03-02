package management;
import java.util.Collection;
import java.util.HashSet;

public interface iPersonDAO {
    void persist(Person person);
    Person findById(int id);
    Person findByEmail(String email);
    HashSet<Person>findAll();
    void remove(int id);

}
