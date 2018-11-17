package com.infosys.sap.entity;

 

import javax.persistence.Entity;

import javax.persistence.Id;

import javax.persistence.Table;

 

@Entity

@Table(name = "SimDetails")

public class SimDetailsEntity {

               

                @Id

                private Integer simId;

                private Long serviceNumber;

                private Long simNumber;

                private String simStatus;

               

                public SimDetailsEntity() {

                                // TODO Auto-generated constructor stub

                }

 

                public SimDetailsEntity(Integer simId, Long serviceNumber, Long simNumber, String simStatus) {

                                super();

                                this.simId = simId;

                                this.serviceNumber = serviceNumber;

                                this.simNumber = simNumber;

                                this.simStatus = simStatus;

                }

 

                public Integer getSimId() {

                                return simId;

                }

 

                public void setSimId(Integer simId) {

                                this.simId = simId;

                }

 

                public Long getServiceNumber() {

                                return serviceNumber;

                }

 

                public void setServiceNumber(Long serviceNumber) {

                                this.serviceNumber = serviceNumber;

                }

 

                public Long getSimNumber() {

                                return simNumber;

                }

 

                public void setSimNumber(Long simNumber) {

                                this.simNumber = simNumber;

                }

 

                public String getSimStatus() {

                                return simStatus;

                }

 

                public void setSimStatus(String simStatus) {

                                this.simStatus = simStatus;

                }

               

               

}

