package com.infosys.sap.model;

 

import javax.validation.constraints.NotNull;

 

import org.hibernate.validator.constraints.NotEmpty;

 

public class CustomerID {

                @NotNull(message = "Enter Id number")

                private Long uniqueIdNumber;

                @NotEmpty(message = "DOB is mandatory")

                private String dateOfBirth;

                @NotEmpty(message = "FirstName is mandatory")

                private String firstName;

                @NotEmpty(message = "Last Name is mandatory")

                private String lastName;

                private String idType;    

                @NotEmpty(message = "state is mandatory")

                private String state;

               

                public Long getUniqueIdNumber() {

                                return uniqueIdNumber;

                }

                public void setUniqueIdNumber(Long uniqueIdNumber) {

                                this.uniqueIdNumber = uniqueIdNumber;

                }

                public String getDateOfBirth() {

                                return dateOfBirth;

                }

                public void setDateOfBirth(String dateOfBirth) {

                                this.dateOfBirth = dateOfBirth;

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

                public String getIdType() {

                                return idType;

                }

                public void setIdType(String idType) {

                                this.idType = idType;

                }

                public String getState() {

                                return state;

                }

                public void setState(String state) {

                                this.state = state;

                }

               

}

