package com.infosys.sap.entity;

 

import java.util.Date;

 

import javax.persistence.CascadeType;

import javax.persistence.Entity;

import javax.persistence.Id;

import javax.persistence.JoinColumn;

import javax.persistence.OneToOne;

import javax.persistence.Table;

import javax.persistence.Temporal;

import javax.persistence.TemporalType;

 

@Entity

@Table(name = "Customer")

public class CustomerEntity {

                @Id

                private long uniqueIdNumber;

                @Temporal(TemporalType.DATE)

                private Date dateOfBirth;

                private String emailAddress;

                private String firstName;

                private String lastName;

                private String idType;

               

                @OneToOne(cascade = CascadeType.ALL)

                @JoinColumn(name = "addressId",unique=true)

                private CustomerAddressEntity address;

               

                @OneToOne(cascade = CascadeType.ALL)

                @JoinColumn(name="simId",unique=true)

                private SimDetailsEntity sim;

               

                private String state;

               

                public CustomerEntity() {

                                // TODO Auto-generated constructor stub

                }

 

                public CustomerEntity(long uniqueIdNumber, Date dateOfBirth, String emailAddress, String firstName, String lastName,

                                                String idType, CustomerAddressEntity address, SimDetailsEntity sim, String state) {

                                super();

                                this.uniqueIdNumber = uniqueIdNumber;

                                this.dateOfBirth = dateOfBirth;

                                this.emailAddress = emailAddress;

                                this.firstName = firstName;

                                this.lastName = lastName;

                                this.idType = idType;

                                this.address = address;

                                this.sim = sim;

                                this.state = state;

                }

 

                public long getUniqueIdNumber() {

                                return uniqueIdNumber;

                }

 

                public void setUniqueIdNumber(long uniqueIdNumber) {

                                this.uniqueIdNumber = uniqueIdNumber;

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

 

                public CustomerAddressEntity getAddress() {

                                return address;

                }

 

                public void setAddress(CustomerAddressEntity address) {

                                this.address = address;

                }

 

                public SimDetailsEntity getSim() {

                                return sim;

                }

 

                public void setSim(SimDetailsEntity sim) {

                                this.sim = sim;

                }

 

                public String getState() {

                                return state;

                }

 

                public void setState(String state) {

                                this.state = state;

                }

 

}

