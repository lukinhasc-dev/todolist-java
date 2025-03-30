package br.com.lucassilva.ToDoList.user;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
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
    
    @PostMapping("/")
    public void create(@RequestBody UserModel userModel) {
        System.out.println(userModel.getUsername());
    }
    
    
}
