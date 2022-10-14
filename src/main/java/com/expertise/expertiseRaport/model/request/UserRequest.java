package com.expertise.expertiseRaport.model.request;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserRequest {
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
