package com.infosys.sap.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Modifying;

import org.springframework.data.jpa.repository.Query;

import org.springframework.data.repository.query.Param;

import org.springframework.stereotype.Repository;

import org.springframework.transaction.annotation.Transactional;

import com.infosys.sap.entity.CustomerAddressEntity;

@Repository

public interface CustomerAddressRepository extends JpaRepository<CustomerAddressEntity, Integer> {

	/*
	 * @Modifying(clearAutomatically = true)
	 * 
	 * @Transactional
	 * 
	 * @Query("insert into CustomerAddressEntity(address,city,pincode,state) values(:a,:c,:p,:s)"
	 * )
	 * 
	 * public void insert(@Param("a")String address, @Param("p")Integer
	 * pinCode, @Param("c")String city, @Param("s")String state);
	 */

	@Modifying(clearAutomatically = true)

	@Transactional

	@Query("update CustomerAddressEntity c set c.address = :a, c.city = :c, c.pincode = :p, c.state = :s where c.addressId = :ai")

	public void update(@Param("a") String address, @Param("p") Integer pinCode, @Param("c") String city,
			@Param("s") String state, @Param("ai") Integer addId);

}
