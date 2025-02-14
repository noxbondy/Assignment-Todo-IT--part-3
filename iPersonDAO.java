package management;
import java.util.Collection;

public interface iPersonDAO {
    void persist(Person person);
    Person findById(int id);
    Person findByEmail(String email);
    Collection<Person>findAll();
    void remove(int id);

}
