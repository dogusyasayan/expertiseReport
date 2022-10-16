package com.expertise.expertiseRaport.controller;

import com.expertise.expertiseRaport.business.service.ExpertService;
import com.expertise.expertiseRaport.model.request.ExpertiseRequest;
import com.expertise.expertiseRaport.model.response.ExpertiseResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/expert")
@RequiredArgsConstructor
public class ExpertReportController {

private  final ExpertService expertService;
    @PostMapping("/add")
    public void addExpert(@RequestBody ExpertiseRequest expertiseRequest) {
        expertService.addExpertiseReport(expertiseRequest);
    }
    @GetMapping("/getExpertise")
    public  List<ExpertiseResponse> getExpertise() {
        List<ExpertiseResponse> expertiseResponses = expertService.getAllExpertiseReports();
        return  expertiseResponses;
    }
}
