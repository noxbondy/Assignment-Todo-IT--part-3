package management;

import java.util.*;

import java.util.Collection;
import java.util.ArrayList;


public class PersonDAO implements iPersonDAO {
    private final List<Person> people = new ArrayList<>();

    @Override
    public void persist(Person person) {
        people.add(person);
    }

    @Override
    public Person findById(int id) {
        return people.stream().filter(p -> p.getId() == id).findFirst().orElse(null);
    }

    @Override
    public Person findByEmail(String email) {
        return people.stream().filter(p -> p.getEmail().equalsIgnoreCase(email)).findFirst().orElse(null);
    }

    @Override
    public List<Person> findAll() {
        return new ArrayList<>(people);
    }

    @Override
    public void remove(int id) {
        people.removeIf(p -> p.getId() == id);
    }
}


