package com.expertise.expertiseRaport.model.response;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TownResponse {
    private Long id;
    private String name;
    private String location;
    private Long cityId;
}
