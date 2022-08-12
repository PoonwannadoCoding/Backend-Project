package com.example.backend.model;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserService {

    public List<User> getUser() {
        return List.of(
                new User(
                        1L,
                        "poon",
                        "worwitpoon@gmail.com",
                        "ACSP12135worawit"
                )
        );
    }
}
