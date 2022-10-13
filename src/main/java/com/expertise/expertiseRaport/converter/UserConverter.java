package com.expertise.expertiseRaport.converter;

import com.expertise.expertiseRaport.domain.User;
import com.expertise.expertiseRaport.model.request.UserRequest;
import com.expertise.expertiseRaport.model.response.UserResponse;
import lombok.Builder;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@RequiredArgsConstructor
@Builder
public class UserConverter {
    public UserResponse userUpdateResponse(UserRequest userRequest, User user){
        return UserResponse.builder()
                .firstName(user.getFirstName())
                .lastName(user.getLastName())
                .build();
    }
/*
    public List<UserResponse> usersList(List<User> userList){
        List<UserResponse> listResponse=new ArrayList<>();

        for (int i=0; i<userList.size(); i++)
        {
            User user=userList.get(i);
            //UserResponse userResponse=new UserResponse();
            UserResponse.builder()
                    .firstName(user.getFirstName())
                    .lastName(user.getLastName())
                    .build();
            listResponse.add();
        }
        return  listResponse;
    }
 */
}
