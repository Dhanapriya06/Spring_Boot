package com.infosys.sap.service;

import org.springframework.beans.factory.annotation.Autowired;



import org.springframework.stereotype.Service;



 



import com.infosys.sap.entity.CustomerEntity;



import com.infosys.sap.entity.CustomerIdentityEntity;



import com.infosys.sap.exceptions.CustomerAlreadyPresentException;



import com.infosys.sap.model.CustomerDetails;



import com.infosys.sap.repository.CustomerIdentityRepository;



import com.infosys.sap.repository.CustomerRepository;



 



@Service



public class CustomerServiceImpl implements CustomerService{



                @Autowired



                CustomerIdentityRepository custIdRepo;



               



                @Autowired



                CustomerRepository custRepo;



               



                /*public CustomerIdentityEntity getCustomerIdDetails(String emailAddress,String dateofBirth) throws CustomerAlreadyPresentException, Exception {



                                               



                                CustomerIdentityEntity emailCheck = custIdRepo.findByEmailAddress(emailAddress);                 



                               



                                CustomerIdentityEntity cie = new CustomerIdentityEntity();



                                if(emailCheck != null) {



                                                cie = custIdRepo.findByEmailAddressAndDateOfBirth(emailAddress,dateofBirth);



                                                if(cie != null) {



                                                                if(emailCheck.getUniqueIdNumber() != cie.getUniqueIdNumber()) {



                                                                                throw new CustomerAlreadyPresentException("Invalid details");



                                                                }



                                                                else {



                                                                                return cie;



                                                                }



                                                }



                                                else {



                                                                throw new Exception("No request placed for you");



                                                }



                                }



                               



                                return cie;



                }*/



               



                public CustomerEntity getCustomerIdDetails(String emailAddress,String dateofBirth,Integer simId) throws CustomerAlreadyPresentException, Exception {



                               



                                //CustomerIdentityEntity emailCheck = custIdRepo.findByEmailAddress(emailAddress);             



                                CustomerEntity cie = new CustomerEntity();



                                CustomerEntity emailCheck = custRepo.findDetails(emailAddress,simId);



                                if(emailCheck != null) {



                                                throw new CustomerAlreadyPresentException("Invalid details");



                                }



                                else {



                                                cie = custRepo.findByEmailAddressAndDateOfBirthAndSimId(emailAddress,dateofBirth,simId);



                                                if(cie == null) {



                                                                throw new Exception("No request placed for you");



                                                }



                                }                             



                                return cie;



                }



               



                public void verifyCustomer(CustomerDetails customer) throws Exception {



                               



                                CustomerIdentityEntity cie =  custIdRepo.findByUniqueIdNumber(customer.getUniqueIdNumber());
                                

                                

                                if(!cie.getFirstName().equals(customer.getFirstName()) || !cie.getLastName().equals(customer.getLastName())) {



                                                throw new Exception("Invalid details");



                                }



                               



                }



               



                public Integer getCustomerAddressId(Long uniqueId) {



                                Integer i = custRepo.getAddress(uniqueId);



                                return i;



                }



               



                public void updateCustomerAddress(Long uniqueId, Integer addressId) {



                                custRepo.updateAddress(uniqueId, addressId);



                }



               



}

