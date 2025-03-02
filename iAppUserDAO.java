package management;

import java.util.HashSet;
import java.util.List;

public interface iAppUserDAO {
    void persist(AppUser user);
    AppUser findByUsername(String username);
    HashSet<AppUser> findAll();
    void remove(String username);
}
