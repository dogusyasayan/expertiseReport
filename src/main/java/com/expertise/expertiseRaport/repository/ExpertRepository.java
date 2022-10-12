package com.expertise.expertiseRaport.repository;

import com.expertise.expertiseRaport.domain.City;
import com.expertise.expertiseRaport.domain.ExpertReport;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExpertRepository extends JpaRepository<ExpertReport,Long> {
}
