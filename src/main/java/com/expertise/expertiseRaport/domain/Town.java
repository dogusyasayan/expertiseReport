package com.expertise.expertiseRaport.domain;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "towns")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
//Semt
public class Town {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String location;
    private Long cityId;
}
