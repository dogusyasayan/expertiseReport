package com.expertise.expertiseRaport.business.manager;

import com.expertise.expertiseRaport.business.service.UserService;
import com.expertise.expertiseRaport.converter.UserRegisterConverter;
import com.expertise.expertiseRaport.domain.User;
import com.expertise.expertiseRaport.model.response.RegisterResponse;
import com.expertise.expertiseRaport.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserManager implements UserService {

    private final UserRepository userRepository;
    private  final UserRegisterConverter userRegisterConverter;

    @Override
    public void register(User user) {
       if ()
    }
}
