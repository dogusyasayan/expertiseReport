package com.expertise.expertiseRaport.repository;

import com.expertise.expertiseRaport.domain.City;
import com.expertise.expertiseRaport.domain.Hood;
import com.expertise.expertiseRaport.domain.Town;
import com.expertise.expertiseRaport.model.request.TownRequest;
import com.expertise.expertiseRaport.model.response.TownResponse;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TownRepository extends JpaRepository<Town,Long> {


}
