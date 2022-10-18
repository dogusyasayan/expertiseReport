package com.expertise.expertiseRaport.domain;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "advertUserMatch")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AdvertUserMatch {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Long adverdId;
    private Long userId;
}
