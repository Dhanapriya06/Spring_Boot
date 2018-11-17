package com.infosys.sap.repository;

 

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

 

import com.infosys.sap.entity.SimOffersEntity;

 

@Repository

public interface SimOffersRepository extends JpaRepository<SimOffersEntity, Integer> {

                public SimOffersEntity findBySim_SimId(Integer simId);

}

