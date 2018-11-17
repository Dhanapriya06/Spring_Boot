package com.infosys.sap.repository;

 

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Modifying;

import org.springframework.data.jpa.repository.Query;

import org.springframework.data.repository.query.Param;

import org.springframework.stereotype.Repository;

import org.springframework.transaction.annotation.Transactional;

 

import com.infosys.sap.entity.SimDetailsEntity;

 

@Repository

public interface SimDetailsRepository extends JpaRepository<SimDetailsEntity, Integer>{

                public SimDetailsEntity findBySimNumberAndServiceNumber(Long simNumber,Long ServiceNumber);

               

                @Modifying(clearAutomatically = true)

                @Transactional

                @Query(value="update SimDetailsEntity set simStatus='active' where simNumber=:sim")

                public void updateSim(@Param("sim") Long simNumber);

}

