package management;
import java.util.*;

public class AppUser  extends Person{
    private String username;
    private String password;
    private AppRole role;



// constructro--


    public AppUser(int id, String name, String email, String username, String password, AppRole role) {
        super(id, name, email);
        setUsername(username);
        setPassword(password);
        setRole(role);
        setCredentials(this);

    }
    // Getter Method


    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public AppRole getRole() {
        return role;
    }

    // settter Method


    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {

        this.password = password;
    }

    public void setRole(AppRole role) {
        Objects.requireNonNull(role, "no user created. Try again");
        this.role = role;
    }



    @Override
    public String toString() {
        return "AppUser{" +
                "role=" + role +
                ", username='" + username + '\'' +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        AppUser appUser = (AppUser) o;
        return Objects.equals(username, appUser.username) && Objects.equals(password, appUser.password) && role == appUser.role;
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, password, role);
    }
}
