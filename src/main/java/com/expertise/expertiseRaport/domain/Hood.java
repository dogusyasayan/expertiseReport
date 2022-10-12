package com.expertise.expertiseRaport.domain;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "hoods")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
//Mahalle
public class Hood {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String location;
    private Long townid;
}
