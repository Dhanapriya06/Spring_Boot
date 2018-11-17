package com.infosys.sap.validation;

 

 

 

import java.text.ParseException;

import java.text.SimpleDateFormat;

 

import org.springframework.stereotype.Component;

import org.springframework.validation.Errors;

import org.springframework.validation.Validator;

 

import com.infosys.sap.model.Customer;

 

 

 

@Component

public class Validate_Email_DOB implements Validator{

 

                @Override

                public boolean supports(Class<?> clazz) {

                                return Customer.class.isAssignableFrom(clazz);

                }

 

                @Override

                public void validate(Object target, Errors errors) {

                                Customer customer = (Customer)target;

                                String dob = customer.getDateOfBirth();

                                if(!dob.isEmpty() && dob != null) {

                                                try {

                                                                new SimpleDateFormat("YYYY-MM-DD").parse(dob);

                                                } catch (ParseException e) {

                                                                // TODO Auto-generated catch block

                                                                e.printStackTrace();

                                                                errors.rejectValue("dateOfBirth", "date.Invalid");

                                                }

                                }

                               

                                String email = customer.getEmailAddress();

                                if(!email.isEmpty() && email != null) {

                                                boolean valid = true;

                                                int countOfAt = 0;

                                                for(char c : email.toCharArray()) {

                                                                if(c == '@') {

                                                                                countOfAt++;

                                                                }

                                                }

                                                if(email.charAt(0) == '@') {

                                                                valid = false;

                                                }

                                                else if(countOfAt != 1) {

                                                                valid = false;

                                                }

                                                else {

                                                                email = email.substring(email.indexOf("@") + 1);

                                                                int countOfDot = 0;

                                                                for(char c : email.toCharArray()) {

                                                                                if(c == '.') {

                                                                                                countOfDot++;

                                                                                }

                                                                }

                                                                if(countOfDot != 1) {

                                                                                valid = false;

                                                                }

                                                                else {

                                                                                email = email.substring(email.indexOf(".") + 1);

                                                                                if(email.length() < 2 || email.length() > 3) {

                                                                                                valid = false;

                                                                                }

                                                                }

                                                }

                                               

                                               

                                               

                                                if(valid == false) {

                                                                errors.rejectValue("emailAddress", "email.Invalid");

                                                }

                                }

                               

                }

 

}