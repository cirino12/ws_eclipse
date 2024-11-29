package services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import entities.User;
import exceptions.ResourceNotFoundException;
import repositories.UserRepository;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<Object> findAll() {
        return userRepository.findAll();
    }

    @Override
    public User findById(Long id) {
        try {
            Optional<User> obj = userRepository.findById(id);
            return obj.orElseThrow(() -> new ResourceNotFoundException("User not found with ID: " + id));
        } catch (RuntimeException e) {
            throw new ResourceNotFoundException("User not found with ID: " + id);
        }
    }

    @Override
    public User insert(User user) {
        return userRepository.save(user);
    }

    @Override
    public void delete(Long id) {
        try {
            findById(id); // Verifica se o usuário existe antes de deletar
            userRepository.deleteById(id);
        } catch (RuntimeException e) {
            throw new ResourceNotFoundException("User not found with ID: " + id);
        }
    }

    @Override
    public User update(Long id, User user) {
        try {
            User existingUser = findById(id); // Verifica se o usuário existe antes de atualizar
            existingUser.setNome(user.getNome());
            existingUser.setEmail(user.getEmail());
            existingUser.setTelefone(user.getTelefone());
            existingUser.setPassword(user.getPassword());
            return userRepository.save(existingUser);
        } catch (RuntimeException e) {
            throw new ResourceNotFoundException("User not found with ID: " + id);
        }
    }

	@Override
	public User findById1(Long id) {
		// TODO Auto-generated method stub
		return null;
	}
}


