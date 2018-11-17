package com.infosys.sap.model;

 

import java.util.Date;

 

import org.hibernate.validator.constraints.NotEmpty;

 

public class CustomerDetails {

                @NotEmpty(message="Enter first Name")

                private String firstName;

                @NotEmpty(message="Enter last Name")

                private String lastName;

                @NotEmpty(message="Confirm Email address")

                private String confirmEmailAddress;

               

                private Long uniqueIdNumber;

                private Date dateOfBirth;

                private String emailAddress;

               

                private boolean confirm;

               

                public boolean isConfirm() {

                                return confirm;

                }

                public void setConfirm(boolean confirm) {

                                this.confirm = confirm;

                }

                public Long getUniqueIdNumber() {

                                return uniqueIdNumber;

                }

                public void setUniqueIdNumber(Long uniqueIdNumber) {

                                this.uniqueIdNumber = uniqueIdNumber;

                }

                public String getFirstName() {

                                return firstName;

                }

                public void setFirstName(String firstName) {

                                this.firstName = firstName;

                }

                public String getLastName() {

                                return lastName;

                }

                public void setLastName(String lastName) {

                                this.lastName = lastName;

                }

                public String getConfirmEmailAddress() {

                                return confirmEmailAddress;

                }

                public void setConfirmEmailAddress(String confirmEmailAddress) {

                                this.confirmEmailAddress = confirmEmailAddress;

                }

                public Date getDateOfBirth() {

                                return dateOfBirth;

                }

                public void setDateOfBirth(Date dateOfBirth) {

                                this.dateOfBirth = dateOfBirth;

                }

                public String getEmailAddress() {

                                return emailAddress;

                }

                public void setEmailAddress(String emailAddress) {

                                this.emailAddress = emailAddress;

                }

               

}

