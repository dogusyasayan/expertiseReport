package com.expertise.expertiseRaport.converter;
import com.expertise.expertiseRaport.domain.Auction;
import com.expertise.expertiseRaport.model.request.AuctionRequest;
import lombok.Builder;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@Builder
public class AuctionConverter {

    public Auction auctionAdd(AuctionRequest auctionRequest) {
        return Auction.builder()
                .userId(auctionRequest.getUserId())
                .expertId(auctionRequest.getExpertId())
                .description(auctionRequest.getDescription())

                .build();
    }
}
