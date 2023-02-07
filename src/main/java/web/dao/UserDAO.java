package web.dao;

import web.model.User;
import java.util.List;

public interface UserDAO {

    List<User>getAllUsers ();
    User getUserById(int id);
//   void addUser(User user);
    void removeUser(int id);
    void updateUser(int id, User user);
    void saveUser(User user);
}