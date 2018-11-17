package com.infosys.sap.validation;

 

import org.springframework.stereotype.Component;

import org.springframework.validation.Errors;

import org.springframework.validation.Validator;

 

import com.infosys.sap.model.CustomerDetails;

 

@Component

public class Customer_Details_Validation implements Validator {

 

                @Override

                public boolean supports(Class<?> clazz) {

                                // TODO Auto-generated method stub

                                return CustomerDetails.class.isAssignableFrom(clazz);

                }

 

                @Override

                public void validate(Object target, Errors errors) {

                                // TODO Auto-generated method stub

                                CustomerDetails cust = (CustomerDetails)target;

                                boolean valid = true;

                                if(cust.getFirstName().length() > 15) {

                                                valid = false;

                                }

                                else {

                                                for(Character c : cust.getFirstName().toCharArray()) {

                                                                if(!Character.isAlphabetic((int)c)) {

                                                                                valid = false;

                                                                                break;

                                                                }

                                                }

                                }

                                if(valid == false) {

                                                errors.rejectValue("firstName", "name.Invalid");

                                }

                               

                                valid = true;

                                if(cust.getLastName().length() > 15) {

                                                valid = false;

                                }

                                else {

                                                for(Character c : cust.getLastName().toCharArray()) {

                                                                if(!Character.isAlphabetic((int)c)) {

                                                                                valid = false;

                                                                                break;

                                                                }

                                                }

                                }

                                if(valid == false) {

                                                errors.rejectValue("lastName", "name.Invalid");

                                }

                               

                                if(!cust.getConfirmEmailAddress().equals(cust.getEmailAddress())) {

                                                errors.rejectValue("confirmEmailAddress", "email.mismatch");

                                }

                }

 

}

