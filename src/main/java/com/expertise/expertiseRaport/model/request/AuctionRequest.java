package com.expertise.expertiseRaport.model.request;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AuctionRequest {
    Long userId;
    Long expertId;
    String description;
    String title;
    LocalDateTime startDate;
    LocalDateTime endDate;
}
