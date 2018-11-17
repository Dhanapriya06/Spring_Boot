package com.infosys.sap.model;

 

import javax.validation.constraints.NotNull;

 

import org.hibernate.validator.constraints.NotEmpty;

 

public class Address {

                private Integer addressId;

                @NotEmpty(message = "Address must not be empty")

                private String address;

                @NotEmpty(message = "City must not be empty")

                private String city;

                @NotNull(message = "Pincode must not be empty")

                private Integer pincode;

                @NotEmpty(message = "State must not be empty")

                private String state;

               

                public Integer getAddressId() {

                                return addressId;

                }

                public void setAddressId(Integer addressId) {

                                this.addressId = addressId;

                }

                public String getAddress() {

                                return address;

                }

                public void setAddress(String address) {

                                this.address = address;

                }

                public String getCity() {

                                return city;

                }

                public void setCity(String city) {

                                this.city = city;

                }

                public Integer getPincode() {

                                return pincode;

                }

                public void setPincode(Integer pincode) {

                                this.pincode = pincode;

                }

                public String getState() {

                                return state;

                }
public void setState(String state) {

                                this.state = state;

                }

               

}

