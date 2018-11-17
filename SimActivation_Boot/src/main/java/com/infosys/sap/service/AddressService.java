package com.infosys.sap.service;



 



import com.infosys.sap.entity.CustomerAddressEntity;



import com.infosys.sap.model.Address;



 



public interface AddressService {



                public Integer putAddress(CustomerAddressEntity address);



                public void update(Integer addressId, Address address);



}



