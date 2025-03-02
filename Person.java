package management;

import java.util.Objects;

public class Person {
    private int Id;
    private String name;
    private  String email;
    private AppUser credentials;

    public Person(int id, String name, String email) {
        Id = id;
        this.name = name;
        this.email = email;
    }

    public int getId() {
        return Id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public AppUser getCredentials() {
        return credentials;
    }

    public void setId(int id) {
        this.Id= PersonIdSequencer.nextId();
    }

    public void setName(String name) {
        if (name.trim().isEmpty()){
            throw new IllegalArgumentException("name cannot be null");
        }
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCredentials(AppUser credentials) {
        Objects.requireNonNull(credentials,"you need to assain user");
        this.credentials = credentials;
    }

    @Override
    public String toString() {
        return "Person{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Id == person.Id && Objects.equals(name, person.name) && Objects.equals(email, person.email) && Objects.equals(credentials, person.credentials);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Id, name, email, credentials);
    }
}
