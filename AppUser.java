package management;
import java.util.*;

public class AppUser  {
    private String username;
    private String password;

    public AppUser(String username, String password) {
        this.username = username;
        this.password = password;

    }

    public String getUsername() {
        return username;
    }
    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "AppUser{" +
                "password='" + password + '\'' +
                ", username='" + username + '\'' +
                '}';
    }
}
