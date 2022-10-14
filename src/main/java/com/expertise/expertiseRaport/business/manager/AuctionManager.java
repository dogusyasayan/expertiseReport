package com.expertise.expertiseRaport.business.manager;

import com.expertise.expertiseRaport.business.service.AuctionService;
import com.expertise.expertiseRaport.converter.AuctionConverter;
import com.expertise.expertiseRaport.domain.Auction;
import com.expertise.expertiseRaport.domain.ExpertReport;
import com.expertise.expertiseRaport.domain.User;
import com.expertise.expertiseRaport.exception.EmptyFieldException;
import com.expertise.expertiseRaport.exception.LoginCantFound;
import com.expertise.expertiseRaport.exception.WrongPriceException;
import com.expertise.expertiseRaport.exception.WrongTimeException;
import com.expertise.expertiseRaport.model.request.AuctionRequest;
import com.expertise.expertiseRaport.model.request.ExpertiseRequest;
import com.expertise.expertiseRaport.repository.AuctionRepository;
import com.expertise.expertiseRaport.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AuctionManager implements AuctionService {


    private  final AuctionRepository auctionRepository;
    private  final AuctionConverter auctionConverter;
    private  final UserRepository userRepository;


    public void addAuction(AuctionRequest request) {


        if (request.getUserId() == null || request.getExpertId() == null || request.getDescription() == null ||
                request.getTitle() == null ) {
            throw new EmptyFieldException();
        }

        LocalDateTime now= LocalDateTime.now();
        if (request.getStartDate().isBefore(now)) {
           throw  new WrongTimeException();
        }

        Optional <User> user=userRepository.findById(request.getUserId());
        if (user.isEmpty()){
            throw new LoginCantFound();
        }
        Auction auction=  auctionConverter.auctionAdd(request);
        auctionRepository.save(auction);

    }
}
