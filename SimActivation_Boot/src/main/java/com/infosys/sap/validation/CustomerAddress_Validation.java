package com.infosys.sap.validation;

 

import org.springframework.stereotype.Component;

import org.springframework.validation.Errors;

import org.springframework.validation.Validator;

 

import com.infosys.sap.model.Address;

 

@Component

public class CustomerAddress_Validation implements Validator {

 

                @Override

                public boolean supports(Class<?> clazz) {

                                // TODO Auto-generated method stub

                                return Address.class.isAssignableFrom(clazz);

                }

 

                @Override

                public void validate(Object target, Errors errors) {

                                // TODO Auto-generated method stub

                                Address address = (Address)target;

                                if(address.getAddress().isEmpty() || address.getAddress() == null || address.getAddress().length() < 5 || address.getAddress().length() > 25) {

                                                errors.rejectValue("address", "Invalid.address");

                                }

                                if(address.getPincode() == null || address.getPincode().toString().length() != 6) {

                                                errors.rejectValue("pincode", "Invalid.pincode");

                                }

                                if(address.getCity().isEmpty() || address.getCity() == null) {

                                                errors.rejectValue("city", "Invalid.city");

                                }

                                else {

                                                for(Character c : address.getCity().toCharArray()) {

                                                                if(c == ' ' || Character.isAlphabetic((int)c)) {

                                                                                continue;

                                                                }

                                                                else {

                                                                                errors.rejectValue("city", "Invalid.city");

                                                                                break;

                                                                }

                                                }

                                }

                               

                                if(address.getState().isEmpty() || address.getState() == null) {

                                                errors.rejectValue("state", "Invalid.state");

                                }

                               

                }

 

}

