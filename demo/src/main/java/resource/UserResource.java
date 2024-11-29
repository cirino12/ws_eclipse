package resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserResource {

    @GetMapping
    public String getAllUsers() {
        // Lógica para obter todos os usuários
        return "Lista de usuários";
    }

    @PostMapping
    public String createUser() {
        // Lógica para criar um novo usuário
        return "Usuário criado";
    }

    @PutMapping
    public String updateUser() {
        // Lógica para atualizar um usuário
        return "Usuário atualizado";
    }

    @DeleteMapping
    public String deleteUser() {
        // Lógica para deletar um usuário
        return "Usuário deletado";
    }
}



