package com.expertise.expertiseRaport.converter;

import com.expertise.expertiseRaport.domain.User;
import com.expertise.expertiseRaport.model.request.RegisterRequest;
import lombok.Builder;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@Builder
public class UserRegisterConverter {

    public RegisterRequest register(User user) {
        RegisterRequest register = new RegisterRequest();
        register.setUserName(register.getUserName());
        register.setPassword(register.getPassword());
        register.setFirstName(register.getFirstName());
        register.setLastName(register.getLastName());
        return register;
    }
}
