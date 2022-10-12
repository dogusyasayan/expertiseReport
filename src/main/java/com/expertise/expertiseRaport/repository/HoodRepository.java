package com.expertise.expertiseRaport.repository;

import com.expertise.expertiseRaport.domain.City;
import com.expertise.expertiseRaport.domain.Hood;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HoodRepository extends JpaRepository<Hood,Long> {
}
