package com.expertise.expertiseRaport.domain;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "advertStatus")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AdvertStatus {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Long advertId;
    private boolean active;
}
