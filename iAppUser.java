package management;

import java.util.List;

public interface iAppUser {
    void persist(AppUser user);
    AppUser findByUsername(String username);
    List<AppUser>findAll();
    void remove(String username);
}
