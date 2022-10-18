package com.expertise.expertiseRaport.model.request;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AdvertRequest {
    private  Long user_id;
    private  String title;
    private  String description;
    private  String imgpath;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
}
