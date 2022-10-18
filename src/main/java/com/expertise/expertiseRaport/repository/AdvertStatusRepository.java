package com.expertise.expertiseRaport.repository;

import com.expertise.expertiseRaport.domain.AdvertStatus;
import com.expertise.expertiseRaport.domain.Auction;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AdvertStatusRepository extends JpaRepository<AdvertStatus, Long> {

    List<AdvertStatus> findAllByActive(boolean active);
}
