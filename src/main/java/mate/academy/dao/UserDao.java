package mate.academy.dao;

import mate.academy.model.User;

public interface UserDao {
    User save(User user);

    User findByEmail(String email);
}
