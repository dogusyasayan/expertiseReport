package com.expertise.expertiseRaport.repository;

import com.expertise.expertiseRaport.domain.Advert;
import com.expertise.expertiseRaport.domain.AdvertUserMatch;
import com.expertise.expertiseRaport.domain.Auction;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AdvertRepository extends JpaRepository<Advert, Long> {

}
