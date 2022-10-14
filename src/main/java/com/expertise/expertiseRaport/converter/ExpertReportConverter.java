package com.expertise.expertiseRaport.converter;

import com.expertise.expertiseRaport.domain.ExpertReport;
import com.expertise.expertiseRaport.domain.User;
import com.expertise.expertiseRaport.model.request.ExpertiseRequest;
import com.expertise.expertiseRaport.model.request.UserRequest;
import com.expertise.expertiseRaport.model.response.ExpertiseResponse;
import com.expertise.expertiseRaport.model.response.UserResponse;
import lombok.Builder;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@Builder
public class ExpertReportConverter {

    public ExpertReport expertiseReportAdd(ExpertiseRequest expertiseRequest) {
        return ExpertReport.builder()
                .userId(expertiseRequest.getUserId())
                .cityId(expertiseRequest.getCityId())
                .hoodId(expertiseRequest.getHoodId())
                .townId(expertiseRequest.getTownId())
                .adress(expertiseRequest.getAdress())
                .price(expertiseRequest.getPrice())
                .build();
    }

}
