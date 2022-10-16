package com.expertise.expertiseRaport.controller;

import com.expertise.expertiseRaport.business.service.TownService;
import com.expertise.expertiseRaport.domain.Town;
import com.expertise.expertiseRaport.model.request.TownRequest;
import lombok.Builder;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
@Component
@RequiredArgsConstructor
@Builder
public class TownCotroller {

    public final TownService townService;


    @GetMapping("/getList/{cityId}")
    public List<Town> getTowns(@PathVariable Long cityId){

        return townService.getTownsByCityId(cityId);
    }

}
