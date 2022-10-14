package com.expertise.expertiseRaport.business.manager;

import com.expertise.expertiseRaport.business.service.HoodService;
import com.expertise.expertiseRaport.domain.Hood;
import com.expertise.expertiseRaport.repository.HoodRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class HoodManager implements HoodService {

    private  final HoodRepository hoodRepository;

    public List<Hood> getHoods(Long townId){

        List<Hood> hoods = hoodRepository.findAllByTownId(townId);

        if (hoods.isEmpty()){
            throw new IllegalArgumentException();//hood cant found exception
        }

        return hoods;
    }

}
