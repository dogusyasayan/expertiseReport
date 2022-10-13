package com.expertise.expertiseRaport.model.response;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class LoginResponse {
    private String firstName;
    private String lastName;
}
