package com.infosys.sap.service;



 



import com.infosys.sap.entity.CustomerEntity;



import com.infosys.sap.exceptions.CustomerAlreadyPresentException;



import com.infosys.sap.model.CustomerDetails;



 



public interface CustomerService {



               



                public CustomerEntity getCustomerIdDetails(String emailAddress,String dateofBirth,Integer simId) throws CustomerAlreadyPresentException, Exception;



                public void verifyCustomer(CustomerDetails customer) throws Exception;



                public Integer getCustomerAddressId(Long uniqueId);



                public void updateCustomerAddress(Long uniqueId, Integer addressId);



                               



}



