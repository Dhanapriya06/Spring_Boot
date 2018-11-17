package com.infosys.sap.repository;

 

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Modifying;

import org.springframework.data.jpa.repository.Query;

import org.springframework.data.repository.query.Param;

import org.springframework.stereotype.Repository;

import org.springframework.transaction.annotation.Transactional;

 

import com.infosys.sap.entity.CustomerEntity;

 

@Repository

public interface CustomerRepository extends JpaRepository<CustomerEntity, Long>{

                @Query("select c from CustomerEntity c where emailAddress = :e and simId != :s")

                public CustomerEntity findDetails(@Param("e")String emailAddress, @Param("s")Integer simId);

               

                @Query("select c from CustomerEntity c where c.emailAddress = :e and c.dateOfBirth=to_date(:d,'YYYY-MM-dd') and simId = :s")

                public CustomerEntity findByEmailAddressAndDateOfBirthAndSimId(@Param("e")String emailAddress,@Param("d")String dateOfBirth, @Param("s")Integer simId);

               

                @Query("select c.address.addressId from CustomerEntity c where c.uniqueIdNumber = :u")

                public Integer getAddress(@Param("u")Long uniqueId);

               

                @Modifying(clearAutomatically = true)

                @Transactional

                @Query("update CustomerEntity c set c.address.addressId = :add where c.uniqueIdNumber = :u")

                public void updateAddress(@Param("u")Long uniqueId, @Param("add")Integer addressId);

}

