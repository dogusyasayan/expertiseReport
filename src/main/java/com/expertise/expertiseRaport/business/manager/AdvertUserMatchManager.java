package com.expertise.expertiseRaport.business.manager;

import com.expertise.expertiseRaport.business.service.AdvertUserMatchService;
import com.expertise.expertiseRaport.domain.Advert;
import com.expertise.expertiseRaport.domain.AdvertUserMatch;
import com.expertise.expertiseRaport.exception.EmptyFieldException;
import com.expertise.expertiseRaport.model.request.AdvertRequest;
import com.expertise.expertiseRaport.repository.AdvertRepository;
import com.expertise.expertiseRaport.repository.AdvertUserMatchRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class AdvertUserMatchManager implements AdvertUserMatchService {

    private  final AdvertUserMatchRepository advertUserMatchRepository;

    public void AdvertUserMatchSave(Long userId,Long advertId){
        AdvertUserMatch advertUserMatch=AdvertUserMatch.builder()
                .adverdId(advertId)
                .userId(userId)
                .build();

        advertUserMatchRepository.save(advertUserMatch);
    }
    public List<AdvertUserMatch> getByUserIdList(Long userId){
        return advertUserMatchRepository.findAllByUserId(userId);
    }



}
