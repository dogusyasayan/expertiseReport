package com.expertise.expertiseRaport.model.response;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AdvertResponse {
    private  Long user_id;
    private  String title;
    private  String description;
    private  String imgpath;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
}
