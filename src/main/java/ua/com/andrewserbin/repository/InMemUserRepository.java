package ua.com.andrewserbin.repository;

import ua.com.andrewserbin.domain.User;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Andrii_Serbin on 29-Sep-17.
 */
public class InMemUserRepository implements UserRepository {
    
    private List<User> users;
    {
        Arrays.asList(
                new User("John", null),
                new User("Petr", null)
        );
    }
    
    @Override
    public Iterable<User> allUsers() {
        return users;
    }

    @Override
    public User getUser() {
        return users.get(0);
    }
}
