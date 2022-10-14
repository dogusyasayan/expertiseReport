package com.expertise.expertiseRaport.controller;

import com.expertise.expertiseRaport.business.service.CityService;
import com.expertise.expertiseRaport.model.response.CityResponse;
import com.expertise.expertiseRaport.model.response.UserResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("/city")
@RequiredArgsConstructor
public class CityController {

    private final CityService cityService;

    @GetMapping("/getAll")
    public List<CityResponse> getAll() {
        List<CityResponse> citys = cityService.getCitys();
        return citys;
    }
}
