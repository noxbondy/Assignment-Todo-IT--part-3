package management;
import java.util.*;

public class AppUserDAO implements iAppUserDAO {
    private final Map<String, AppUser> userMap = new HashMap<>();

    @Override
    public void persist(AppUser user) {
        userMap.put(user.getUsername(), user);
    }

    @Override
    public AppUser findByUsername(String username) {
        return userMap.get(username);
    }

    @Override
    public HashSet<AppUser> findAll() {
        return new HashSet<>(userMap.values());
    }

    @Override
    public void remove(String username) {
        userMap.remove(username);
    }
}
