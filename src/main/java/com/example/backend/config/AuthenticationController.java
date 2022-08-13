package com.example.backend.config;

import org.springframework.security.core.context.SecurityContextHolder;
import com.example.backend.ResponseDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

@RestController
public class AuthenticationController {

    @PostMapping("/api/login")
    public ResponseDTO login(HttpServletRequest request){
        String username = request.getParameter("username");
        String password = request.getParameter("password");


        try{
            Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();

            if (principal != null && principal instanceof com.example.backend.model.User){
                request.logout();
            }

            request.login(username,password);

            return ResponseDTO.builder().success(true).message("Logging in successfully").build();
        }

        catch (ServletException e){
            return ResponseDTO.builder().success(false).message("Logging in fail " + e).build();
        }

    }




}
