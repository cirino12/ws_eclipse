package repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl {
    
    @Autowired
    private UserRepository userRepository;
    
    public void deleteUser(Long id) {
        userRepository.deleteById(id);  // Esse método deve funcionar
    }
}
