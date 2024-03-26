package com.simpleform.service;

import com.simpleform.model.UsersModel;
import com.simpleform.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsersService {
    @Autowired
    private final UserRepository userRepository;

    public UsersService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UsersModel registerUser(String login,String password ,String email) {
        if(login!=null && password != null){
           return null;
        }
        else{
            UsersModel usersModel = new UsersModel();
            usersModel.setLogin(login);
            usersModel.setPassword(password);
            usersModel.setEmail(email);
          return   userRepository.save(usersModel);
        }
    }

    public UsersModel authenticate (String login ,String password){
return userRepository.findByLoginAndPassword(login,password).orElse(null);
    }

}
