package com.expertise.expertiseRaport.converter;

import com.expertise.expertiseRaport.domain.Advert;
import com.expertise.expertiseRaport.model.request.AdvertRequest;
import com.expertise.expertiseRaport.model.response.AdvertResponse;
import lombok.Builder;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@Builder
public class AdvertConverter {
    public Advert advertAdd(AdvertRequest request) {
        Advert advert = Advert.builder()
                .description(request.getDescription())
                .title(request.getTitle())
                .imgpath(request.getImgpath())
                .startDate(request.getStartDate())
                .endDate(request.getEndDate())
                .build();
        return  advert;
    }
}
