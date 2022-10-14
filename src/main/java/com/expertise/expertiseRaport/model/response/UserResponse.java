package com.expertise.expertiseRaport.model.response;


import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserResponse {
    private Long id;
    private String firstName;
    private String lastName;
    private String cityId;
    private String townId;
    private String hoodId;
    private String adress;
    private String userName;
    private String password;
    private boolean status;

}
