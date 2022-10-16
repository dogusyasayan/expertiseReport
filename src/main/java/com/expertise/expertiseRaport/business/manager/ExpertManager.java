package com.expertise.expertiseRaport.business.manager;

import com.expertise.expertiseRaport.business.service.ExpertService;
import com.expertise.expertiseRaport.converter.ExpertReportConverter;
import com.expertise.expertiseRaport.domain.ExpertReport;
import com.expertise.expertiseRaport.domain.User;
import com.expertise.expertiseRaport.exception.*;
import com.expertise.expertiseRaport.model.request.ExpertiseRequest;
import com.expertise.expertiseRaport.model.request.RegisterRequest;
import com.expertise.expertiseRaport.model.response.ExpertiseResponse;
import com.expertise.expertiseRaport.repository.ExpertRepository;
import com.expertise.expertiseRaport.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ExpertManager implements ExpertService {

    private final ExpertRepository expertRepository;
    private final ExpertReportConverter expertReportConverter;

    private  final UserRepository userRepository;

    public void addExpertiseReport(ExpertiseRequest request) {


        if (request.getUserId() == null || request.getCityId() == null || request.getHoodId() == null ||
                request.getTownId() == null || request.getAdress() == null || request.getPrice() == null) {
            throw new EmptyFieldException();
        }
        if (request.getPrice() < 1000) {
            throw new WrongPriceException();
        }

        Optional <User> user=userRepository.findById(request.getUserId());
        if (user.isEmpty()) {
            throw new LoginCantFound();
        }
        ExpertReport expertReport=  expertReportConverter.expertiseReportAdd(request);
        expertRepository.save(expertReport);
    }
    public List<ExpertiseResponse> getAllExpertiseReports(){
        List<ExpertReport> expertReports=expertRepository.findAll();
        if (expertReports.isEmpty()){
            throw new IllegalArgumentException();
        }
        return expertReportConverter.expertiseResponseList(expertReports);
    }
}
