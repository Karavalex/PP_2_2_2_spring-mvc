package web.service;

import web.model.User;
import java.util.List;

public interface UserService {
    void saveUser(User user);
    List<User> getAllUsers ();
    Object getUserById(int id);
//    void addUser(User user);
    void removeUser(int id);
    void updateUser(int id, User user);
}