package com.expertise.expertiseRaport.repository;

import com.expertise.expertiseRaport.domain.City;
import com.expertise.expertiseRaport.domain.Hood;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface HoodRepository extends JpaRepository<Hood,Long> {
    List<Hood> findAllByTownId(Long townId);
}
