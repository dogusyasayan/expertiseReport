package com.expertise.expertiseRaport.business.service;

import com.expertise.expertiseRaport.model.request.ExpertiseRequest;
import com.expertise.expertiseRaport.model.response.ExpertiseResponse;

import java.util.List;

public interface ExpertService {

    void addExpertiseReport(ExpertiseRequest request);

    List<ExpertiseResponse> getAllExpertiseReports();
}
