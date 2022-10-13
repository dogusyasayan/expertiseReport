package com.expertise.expertiseRaport.business.manager;

import com.expertise.expertiseRaport.business.service.UserService;
import com.expertise.expertiseRaport.converter.UserConverter;
import com.expertise.expertiseRaport.converter.UserRegisterConverter;
import com.expertise.expertiseRaport.domain.User;
import com.expertise.expertiseRaport.exception.LoginCantFound;
import com.expertise.expertiseRaport.exception.UserAlreadyExits;
import com.expertise.expertiseRaport.exception.UserIsNotExitsException;
import com.expertise.expertiseRaport.exception.UserNameAndPasswordCantBeNull;
import com.expertise.expertiseRaport.model.request.LoginRequest;
import com.expertise.expertiseRaport.model.request.RegisterRequest;
import com.expertise.expertiseRaport.model.request.UserRequest;
import com.expertise.expertiseRaport.model.response.LoginResponse;
import com.expertise.expertiseRaport.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserManager implements UserService {

    private final UserRepository userRepository;
    private final UserConverter userConverter;
    private  final UserRegisterConverter userRegisterConverter;

    @Override
    public void register(RegisterRequest request) {
        if (request.getUserName()==null || request.getPassword()==null)
        {
            throw new UserNameAndPasswordCantBeNull();
        }
        Optional<User> user=userRepository.findFirstByUserName(request.getUserName());
       if (user.isPresent()) {
           throw  new UserAlreadyExits();
       }

       User user1= User.builder()
               .firstName(request.getFirstName())
               .lastName(request.getLastName())
               .userName(request.getUserName())
               .password(request.getPassword())
               .status(true)
               .build();
        userRepository.save(user1);
    }

    public LoginResponse login(LoginRequest loginRequest){
        Optional<User> user=userRepository.findFirstByUserNameAndPassword(loginRequest.getUserName(), loginRequest.getPassword());
        if (user.isEmpty()){
            throw  new LoginCantFound();
        }
        LoginResponse response= LoginResponse.builder()
                .firstName(user.get().getFirstName())
                .lastName(user.get().getLastName())
                .build();
        return  response;
    }

    @Override
    public void delete(Long id) {
        Optional<User> resultUser=userRepository.findById(id);

        if (resultUser.isEmpty()){
 throw  new UserIsNotExitsException();
        }
    }

    @Override
    public User update(Long id, UserRequest userRequest) {
        Optional<User> updatedUser=userRepository.findById(id);
        if (updatedUser.isEmpty()) {
            throw new UserIsNotExitsException();
        }
        userConverter.userUpdateResponse(userRequest,updatedUser.get());

        return userRepository.save(updatedUser.get());
    }

    @Override
    public List<User> getAllUser() {
        List<User> users = userRepository.findAll();
        if (CollectionUtils.isEmpty(users)) {
            throw new UserIsNotExitsException();
        }
        return users;
    }
}
