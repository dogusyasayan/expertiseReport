package com.expertise.expertiseRaport.domain;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "adverts")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Advert {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private String description;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private String imgpath;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "advertId", referencedColumnName = "id", foreignKey = @ForeignKey(name = "fk_advert_status"))
    private AdvertStatus status;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "advertId", referencedColumnName = "id")
    private AdvertUserMatch user;

}
