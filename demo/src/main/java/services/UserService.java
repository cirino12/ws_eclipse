package services;

import java.util.List;
import entities.User;

public interface UserService {
    List<Object> findAll();
    User findById(Long id);
    User insert(User user);
    void delete(Long id);
    User update(Long id, User user);
	User findById1(Long id);
}
