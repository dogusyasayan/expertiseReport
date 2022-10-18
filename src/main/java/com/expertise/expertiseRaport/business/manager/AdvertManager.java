package com.expertise.expertiseRaport.business.manager;

import com.expertise.expertiseRaport.business.service.AdvertService;
import com.expertise.expertiseRaport.converter.AdvertConverter;
import com.expertise.expertiseRaport.domain.Advert;
import com.expertise.expertiseRaport.domain.AdvertStatus;
import com.expertise.expertiseRaport.domain.AdvertUserMatch;
import com.expertise.expertiseRaport.exception.EmptyFieldException;
import com.expertise.expertiseRaport.model.request.AdvertRequest;
import com.expertise.expertiseRaport.repository.AdvertRepository;
import com.expertise.expertiseRaport.repository.AdvertUserMatchRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AdvertManager {

    private final AdvertRepository advertRepository;

    private final AdvertUserMatchRepository advertUserMatchRepository;
    private final AdvertConverter advertConverter;
    private final AdvertUserMatchManager advertUserMatchManager;

    private final AdvertService advertService;

    private final AdvertStatusManager advertStatusManager;

    public void addAdvert(AdvertRequest advertRequest) {
        if (advertRequest.getUser_id() == null || advertRequest.getDescription() == null || advertRequest.getTitle() == null || advertRequest.getImgpath() == null) {
            throw new EmptyFieldException();
        }
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime plusthirtydays = now.plusDays(30);

        Advert advert = advertConverter.advertAdd(advertRequest);

        Advert advert1 = advertRepository.save(advert);
        advertUserMatchManager.AdvertUserMatchSave(advertRequest.getUser_id(), advert1.getId());
        advertStatusManager.AdvertStatusSave(advert1.getId(), true);
    }

    public void addAdvert_(AdvertRequest request){

        AdvertStatus status = AdvertStatus.builder()
                .active(true)
                .build();

        AdvertUserMatch userMatch = AdvertUserMatch.builder()
                .userId(request.getUser_id())
                .build();

        Advert ad = Advert.builder()
                .title("asdasd")
                .status(status)
                .user(userMatch)
                .build();

        advertRepository.save(ad);
    }

    public Advert getAdvertById(Long adId){

        Optional<Advert> ad = advertRepository.findById(adId);
        if (ad.isEmpty()){
            throw new EmptyFieldException();
        }

        AdvertUserMatch userMatch = ad.get().getUser();

        return ad.get();
    }

    public List<Advert> getActiveAdvert() {
        List<AdvertStatus> advertStatuses = advertStatusManager.getActiveList();
        List<Advert> result = new ArrayList<>();
        for (int i = 0; i < advertStatuses.size(); i++) {
            Optional<Advert> advert = advertRepository.findById(advertStatuses.get(i).getAdvertId());
            if (advert.isEmpty()) {
                continue;
            }
            result.add(advert.get());
        }
        return result;
    }

    public List<Advert> getUserId(Long userId) {
        List<AdvertUserMatch> advertUserMatches = advertUserMatchRepository.findAllByUserId(userId);
        List<Advert> result = new ArrayList<>();
        for (int i = 0; i < advertUserMatches.size(); i++) {
            Optional<Advert> advert = advertRepository.findById(advertUserMatches.get(i).getAdverdId());
            if (advert.isEmpty()) {
                continue;
            }
            result.add(advert.get());
        }
        return result;
    }

    public List<Advert> getActiveAdvertsByUserId_(Long userId){

        List<AdvertStatus> advertStatuses = advertStatusManager.getActiveList();
        List<AdvertUserMatch> advertUserMatches = advertUserMatchManager.getByUserIdList(userId);
        List<Advert> result = new ArrayList<>();

        for (int i = 0; i < advertStatuses.size(); i++){

            for (int j = 0; j < advertUserMatches.size(); j++){
                if (advertStatuses.get(i).getAdvertId() == advertUserMatches.get(j).getAdverdId()){
                    Optional<Advert> advert = advertRepository.findById(advertStatuses.get(i).getAdvertId());
                    if (advert.isEmpty()){
                        continue;
                    }

                    result.add(advert.get());
                }
            }
        }

        return result;
    }
}


