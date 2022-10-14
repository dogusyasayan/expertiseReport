package com.expertise.expertiseRaport.model.response;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ExpertiseResponse {
    private Long id;
    private Long userId;
    private Long cityId;
    private Long townId;
    private Long hoodId;
    private String adress;
    private Double price;
}
