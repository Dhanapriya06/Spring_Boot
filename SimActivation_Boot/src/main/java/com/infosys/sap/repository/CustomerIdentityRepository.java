package com.infosys.sap.repository;

 

 

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;

import org.springframework.data.repository.query.Param;

import org.springframework.stereotype.Repository;

 

import com.infosys.sap.entity.CustomerIdentityEntity;

 

@Repository

public interface CustomerIdentityRepository extends JpaRepository<CustomerIdentityEntity, Long>{

                @Query("select c from CustomerIdentityEntity c where c.emailAddress = :email and c.dateOfBirth=to_date(:d,'YYYY-MM-dd')")

                public CustomerIdentityEntity findByEmailAddressAndDateOfBirth(@Param("email")String emailAddress, @Param("d")String dateofBirth);

               

                //@Query("select c from CustomerIdentityEntity c where c.emailAddress = :email")

                public CustomerIdentityEntity findByEmailAddress(String emailAddress);
                
                public CustomerIdentityEntity findByUniqueIdNumber(long uniqueIdNumber);
                               

}

