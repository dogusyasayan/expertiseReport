package com.expertise.expertiseRaport.business.service;

import com.expertise.expertiseRaport.domain.User;
import com.expertise.expertiseRaport.model.request.LoginRequest;
import com.expertise.expertiseRaport.model.request.RegisterRequest;
import com.expertise.expertiseRaport.model.request.UserRequest;
import com.expertise.expertiseRaport.model.response.LoginResponse;
import com.expertise.expertiseRaport.model.response.UserResponse;

import java.util.List;


public interface UserService {

    void register(RegisterRequest request);

    LoginResponse login(LoginRequest request);

    void delete(Long id);

     User update(Long id, UserRequest user);

     List<UserResponse> getAllUser();

}
