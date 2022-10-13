package com.expertise.expertiseRaport.repository;

import com.expertise.expertiseRaport.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public  interface UserRepository extends JpaRepository<User,Long> {
    Optional<User> findFirstByUserName(String userName);
    Optional<User> findFirstByUserNameAndPassword(String userName,String password);
}
