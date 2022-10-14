package com.expertise.expertiseRaport.converter;

import com.expertise.expertiseRaport.domain.City;
import com.expertise.expertiseRaport.domain.User;
import com.expertise.expertiseRaport.model.response.CityResponse;
import com.expertise.expertiseRaport.model.response.UserResponse;
import lombok.Builder;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@RequiredArgsConstructor
@Builder
public class CityConverter {

    public List<CityResponse> citysList(List<City> cityList){
        List<CityResponse> listResponse=new ArrayList<>();

        for (int i=0; i<cityList.size(); i++)
        {
            City city=cityList.get(i);
            CityResponse response= CityResponse.builder()
                    .name(city.getName())
                    .build();
            listResponse.add(response);
        }
        return  listResponse;
    }
}
