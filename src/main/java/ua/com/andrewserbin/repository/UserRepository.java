package ua.com.andrewserbin.repository;

import ua.com.andrewserbin.domain.User;

/**
 * Created by Andrii_Serbin on 29-Sep-17.
 */
public interface UserRepository {
    
    Iterable<User> allUsers();
    
    User getUser();
}
