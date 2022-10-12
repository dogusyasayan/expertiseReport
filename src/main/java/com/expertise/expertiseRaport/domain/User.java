package com.expertise.expertiseRaport.domain;

import lombok.*;

import javax.persistence.*;

@Entity
@Table (name = "users")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
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

