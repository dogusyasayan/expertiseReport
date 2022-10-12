package com.expertise.expertiseRaport.domain;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "expertReports")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ExpertReport {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Long userId;
    private Long cityId;
    private Long townId;
    private Long hoodId;
    private String adress;
    private Double price;
}
