package com.expertise.expertiseRaport.business.service;

import com.expertise.expertiseRaport.converter.UserRegisterConverter;
import com.expertise.expertiseRaport.domain.User;
import com.expertise.expertiseRaport.model.response.RegisterResponse;
import com.expertise.expertiseRaport.repository.UserRepository;
import lombok.Builder;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


public interface UserService  {

void register(User user);

}
