package com.expertise.expertiseRaport.business.manager;

import com.expertise.expertiseRaport.domain.AdvertStatus;
import com.expertise.expertiseRaport.repository.AdvertStatusRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor

public class AdvertStatusManager {


    private final AdvertStatusRepository advertStatusRepository;

    public void AdvertStatusSave (Long advertId,boolean active)
    {
        AdvertStatus advertStatus=AdvertStatus.builder()
                .advertId(advertId)
                .active(active)
                .build();

        advertStatusRepository.save(advertStatus);
    }

    public List<AdvertStatus> getActiveList() {
         return advertStatusRepository.findAllByActive(true);
    }
}
