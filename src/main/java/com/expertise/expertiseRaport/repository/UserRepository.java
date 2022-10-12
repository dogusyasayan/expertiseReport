package com.expertise.expertiseRaport.repository;

import com.expertise.expertiseRaport.domain.City;
import com.expertise.expertiseRaport.domain.User;
import com.expertise.expertiseRaport.model.response.RegisterResponse;
import org.springframework.data.jpa.repository.JpaRepository;

public  interface UserRepository extends JpaRepository<User,Long> {
    RegisterResponse register(RegisterResponse register);
}
