package com.expertise.expertiseRaport.business.manager;

import com.expertise.expertiseRaport.business.service.TownService;
import com.expertise.expertiseRaport.converter.TownConverter;
import com.expertise.expertiseRaport.domain.City;
import com.expertise.expertiseRaport.domain.Town;
import com.expertise.expertiseRaport.model.request.TownRequest;
import com.expertise.expertiseRaport.model.response.TownResponse;
import com.expertise.expertiseRaport.repository.TownRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TownManager implements TownService {

    private final TownRepository townRepository;
    private final TownConverter townConverter;

    public List<TownResponse> getTowns(TownRequest request) {
        List<Town> towns = townRepository.findAll();
        if (towns.isEmpty()) {
            throw new IllegalArgumentException("Town not found!");
        }
        if (request.getCityId() == null) {
            throw new IllegalArgumentException("CityId is null");
        }
        return townConverter.townsList(towns);
    }

}
