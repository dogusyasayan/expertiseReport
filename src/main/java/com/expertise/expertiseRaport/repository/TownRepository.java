package com.expertise.expertiseRaport.repository;

import com.expertise.expertiseRaport.domain.City;
import com.expertise.expertiseRaport.domain.Town;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TownRepository extends JpaRepository<Town,Long> {
}
