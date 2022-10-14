package com.expertise.expertiseRaport.controller;

import com.expertise.expertiseRaport.business.service.AuctionService;
import com.expertise.expertiseRaport.model.request.AuctionRequest;
import com.expertise.expertiseRaport.model.request.ExpertiseRequest;
import com.expertise.expertiseRaport.model.request.RegisterRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auction")
@RequiredArgsConstructor
public class AuctionController {

    private  final AuctionService auctionService;
    @PostMapping("/add")
    public void addAuction(@RequestBody AuctionRequest auctionRequest) {
        auctionService.addAuction(auctionRequest);
    }
}
