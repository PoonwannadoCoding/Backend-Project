package com.example.backend.model;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class UserConfig {

    @Bean
    CommandLineRunner commandLineRunner(UserRepository repository){
        return args -> {
            User poon = new User(
                    "poon",
                    "worwitpoon@gmail.com",
                    "ACSP12135worawit"
            );

            User yeet = new User(
                    "yeet",
                    "ggez@gmail.com",
                    "123456"
            );

            //repository.saveAll(List.of(poon));
//            repository.save(poon);

            repository.saveAll(List.of(poon,yeet));
        };
    }
}
