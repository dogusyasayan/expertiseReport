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

import java.util.ArrayList;
import java.util.List;

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

    public List<ExpertiseResponse> expertiseResponseList(List<ExpertReport> expertReportList) {
        List<ExpertiseResponse> listResponse = new ArrayList<>();

        for (int i = 0; i < expertReportList.size(); i++) {
            ExpertReport expertReport = expertReportList.get(i);
            ExpertiseResponse response = ExpertiseResponse.builder()
                    .userId(expertReport.getUserId())
                    .adress(expertReport.getAdress())
                    .cityId(expertReport.getCityId())
                    .hoodId(expertReport.getHoodId())
                    .townId(expertReport.getTownId())
                    .price(expertReport.getPrice())
                    .build();
            listResponse.add(response);
        }
        return listResponse;
    }

}
