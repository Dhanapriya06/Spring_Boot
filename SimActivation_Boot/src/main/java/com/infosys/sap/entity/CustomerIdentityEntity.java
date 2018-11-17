package com.infosys.sap.entity;

 

import java.util.Date;

 

import javax.persistence.Entity;

import javax.persistence.Id;

import javax.persistence.Table;

import javax.persistence.Temporal;

import javax.persistence.TemporalType;

 

@Entity

@Table(name = "CustomerIdentity")

public class CustomerIdentityEntity {

                @Id

                private Long uniqueIdNumber;

                @Temporal(TemporalType.DATE)

                private Date dateOfBirth;

                private String firstName;

                private String lastName;

                private String emailAddress;

                private String state;

               

                public CustomerIdentityEntity() {

                                // TODO Auto-generated constructor stub

                }

 

                public CustomerIdentityEntity(Long uniqueIdNumber, Date dateOfBirth, String firstName, String lastName,

                                                String emailAddress, String state) {

                                super();

                                this.uniqueIdNumber = uniqueIdNumber;

                                this.dateOfBirth = dateOfBirth;

                                this.firstName = firstName;

                                this.lastName = lastName;

                                this.emailAddress = emailAddress;

                                this.state = state;

                }

 

                public long getUniqueIdNumber() {

                                return uniqueIdNumber;

                }

 

                public void setUniqueIdNumber(Long uniqueIdNumber) {

                                this.uniqueIdNumber = uniqueIdNumber;

                }

 

                public Date getDateOfBirth() {

                                return dateOfBirth;

                }

 

                public void setDateOfBirth(Date dateOfBirth) {

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

 

                public String getEmailAddress() {

                                return emailAddress;

                }

 

                public void setEmailAddress(String emailAddress) {

                                this.emailAddress = emailAddress;

                }

 

                public String getState() {

                                return state;

                }

 

                public void setState(String state) {

                                this.state = state;

                }

               

}

