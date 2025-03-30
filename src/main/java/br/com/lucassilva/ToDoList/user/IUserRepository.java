package br.com.lucassilva.ToDoList.user;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository <UserModel, UUID>{ //Interface é um modelo dentro da nossa aplicação, tal interface vai ter esse método e etc.
    UserModel findByUsername(String username);


}
