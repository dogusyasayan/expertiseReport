package com.expertise.expertiseRaport.model.request;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TownRequest {
    private Long id;
    private String name;
    private String location;
    private Long cityId;
}
