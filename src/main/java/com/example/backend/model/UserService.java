package com.example.backend.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserService {

    private final UserRepository userRepository;

   @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserDetails loadUserByUsername(String username){
       User u = userRepository.findFirstByUsername(username);

       if(u != null){
           return org.springframework.security.core.userdetails.User.withUsername(u.getUsername()).password(u.getPassword()).build();
       }
       else {
           throw new UsernameNotFoundException("Invalid username or password");
       }
    }


    public List<User> getUser() {
        return userRepository.findAll();
    }
}
