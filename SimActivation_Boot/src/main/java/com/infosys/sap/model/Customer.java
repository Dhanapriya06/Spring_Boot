package com.infosys.sap.model;

 

import org.hibernate.validator.constraints.NotEmpty;

 

 

public class Customer {

                @NotEmpty(message = "Date of birth is mandatory")

                private String dateOfBirth;

                @NotEmpty(message = "Email address is mandatory")

                private String emailAddress;

               

               

               

                public String getDateOfBirth() {

                                return dateOfBirth;

                }

                public void setDateOfBirth(String dateOfBirth) {

                                this.dateOfBirth = dateOfBirth;

                }

                public String getEmailAddress() {

                                return emailAddress;

                }

                public void setEmailAddress(String emailAddress) {

                                this.emailAddress = emailAddress;

                }

               

               

}

