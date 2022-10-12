package com.expertise.expertiseRaport.repository;

import com.expertise.expertiseRaport.domain.Auction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuctionRepository extends JpaRepository<Auction, Long> {
}
