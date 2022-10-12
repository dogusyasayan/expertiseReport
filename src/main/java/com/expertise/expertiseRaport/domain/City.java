package com.expertise.expertiseRaport.domain;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "citys")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
//Şehir
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String location;

}
