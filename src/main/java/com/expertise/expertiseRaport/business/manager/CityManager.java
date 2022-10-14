package com.expertise.expertiseRaport.business.manager;

import com.expertise.expertiseRaport.business.service.CityService;
import com.expertise.expertiseRaport.converter.CityConverter;
import com.expertise.expertiseRaport.domain.City;
import com.expertise.expertiseRaport.model.response.CityResponse;
import com.expertise.expertiseRaport.repository.CityRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;
@Service
@RequiredArgsConstructor
public class CityManager implements CityService {
private final CityRepository cityRepository;
private  final CityConverter cityConverter;
    public List<CityResponse> getCitys() {
        List<City> citys = cityRepository.findAll();
        if(CollectionUtils.isEmpty(citys)) {
            throw new IllegalArgumentException("City not found!");
            // exception firlat
        }
        return cityConverter.citysList(citys);
    }
}
