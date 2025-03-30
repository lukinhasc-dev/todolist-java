package br.com.lucassilva.ToDoList.user;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;


/*Modificadores em Java
 * Public
 * Private
 * Protected
 */

@RestController
@RequestMapping("/users")
public class UserController {
    /* String, Integer, Double, Float, Char, Date, Void são alguns tipos de escopos para classes */
    
    @Autowired
    private IUserRepository userRepository;


    @PostMapping("/")
    public UserModel create(@RequestBody UserModel userModel) {
        var user = this.userRepository.findByUsername(userModel.getUsername());
        if (user != null) {
            System.out.println("Usuário já Existe");
            return null;
        }

        var userCreated = this.userRepository.save(userModel);
        return userCreated;
    }
    
    
}
