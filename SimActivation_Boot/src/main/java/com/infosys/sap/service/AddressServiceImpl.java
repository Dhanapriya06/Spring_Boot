package com.infosys.sap.service;



 



import org.springframework.beans.factory.annotation.Autowired;



import org.springframework.stereotype.Service;



 



import com.infosys.sap.entity.CustomerAddressEntity;



import com.infosys.sap.model.Address;



import com.infosys.sap.repository.CustomerAddressRepository;



 



@Service



public class AddressServiceImpl implements AddressService{



               



                @Autowired



                CustomerAddressRepository addRepo;



               



                public Integer putAddress(CustomerAddressEntity address) {



                                CustomerAddressEntity a = addRepo.save(address);



                                addRepo.flush();



                                return a.getAddressId();



                }



               



                public void update(Integer addressId, Address address) {



                                addRepo.update(address.getAddress(), address.getPincode(), address.getCity(), address.getState(), addressId);



                }



}



