package com.expertise.expertiseRaport.controller;

import com.expertise.expertiseRaport.business.service.UserService;
import com.expertise.expertiseRaport.domain.User;
import com.expertise.expertiseRaport.model.request.LoginRequest;
import com.expertise.expertiseRaport.model.request.RegisterRequest;
import com.expertise.expertiseRaport.model.request.UserRequest;
import com.expertise.expertiseRaport.model.response.LoginResponse;
import com.expertise.expertiseRaport.model.response.UserResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

    public  final UserService userService;

    @PostMapping("/register")
    public  void register(@RequestBody RegisterRequest request) throws  Exception{
        userService.register(request);
    }
    @GetMapping("/login")
    public LoginResponse login (@RequestBody LoginRequest request){
        return  userService.login(request);
    }
    @DeleteMapping("/delete/id")
    @ResponseStatus(value = HttpStatus.ACCEPTED)
    public void delete(@PathVariable("id") Long id) {
        userService.delete(id);
    }
    @GetMapping("/getAll")
    public List<User> getProduct() {
        List<User> users = userService.getAllUser();
        return null;

    }


}

