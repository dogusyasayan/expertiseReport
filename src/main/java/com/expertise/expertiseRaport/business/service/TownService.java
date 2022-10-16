package com.expertise.expertiseRaport.business.service;

import com.expertise.expertiseRaport.domain.Town;
import com.expertise.expertiseRaport.model.request.TownRequest;
import com.expertise.expertiseRaport.model.response.TownResponse;

import java.util.List;

public interface TownService {

    List<Town> getTownsByCityId(Long cityId);
}
