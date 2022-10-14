package com.expertise.expertiseRaport.model.request;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ExpertiseRequest {
    private Long id;
    private Long userId;
    private Long cityId;
    private Long townId;
    private Long hoodId;
    private String adress;
    private Double price;

}
