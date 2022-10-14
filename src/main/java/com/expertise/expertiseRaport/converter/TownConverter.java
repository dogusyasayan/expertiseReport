package com.expertise.expertiseRaport.converter;

import com.expertise.expertiseRaport.domain.City;
import com.expertise.expertiseRaport.domain.Town;
import com.expertise.expertiseRaport.model.response.CityResponse;
import com.expertise.expertiseRaport.model.response.TownResponse;
import lombok.Builder;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@RequiredArgsConstructor
@Builder
public class TownConverter {

    public List<TownResponse> townsList(List<Town> townList){
        List<TownResponse> listResponse=new ArrayList<>();

        for (int i=0; i<townList.size(); i++)
        {
            Town town=townList.get(i);
            TownResponse response= TownResponse.builder()
                    .location(town.getLocation())
                    .name(town.getName())
                    .build();
            listResponse.add(response);
        }
        return  listResponse;
    }
}
