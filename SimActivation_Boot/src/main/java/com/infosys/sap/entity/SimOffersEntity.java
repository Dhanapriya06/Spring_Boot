package com.infosys.sap.entity;

 

import javax.persistence.CascadeType;

import javax.persistence.Entity;

import javax.persistence.Id;

import javax.persistence.JoinColumn;

import javax.persistence.OneToOne;

import javax.persistence.Table;

 

@Entity

@Table(name = "SimOffers")

public class SimOffersEntity {

                @Id

                private int offerId;

                private int callQty;

                private int cost;

                private int dataQty;

                private int duration;

                private String offerName;

                @OneToOne(cascade = CascadeType.ALL)

                @JoinColumn(name="simId",unique=true)

                private SimDetailsEntity sim;

               

                public SimOffersEntity() {

                                // TODO Auto-generated constructor stub

                }

 

                public SimOffersEntity(int offerId, int callQty, int cost, int dataQty, int duration, String offerName,

                                                SimDetailsEntity sim) {

                                super();

                                this.offerId = offerId;

                                this.callQty = callQty;

                                this.cost = cost;

                                this.dataQty = dataQty;

                                this.duration = duration;

                                this.offerName = offerName;

                                this.sim = sim;

                }

 

                public int getOfferId() {

                                return offerId;

                }

 

                public void setOfferId(int offerId) {

                                this.offerId = offerId;

                }

 

                public int getCallQty() {

                                return callQty;

                }

 

                public void setCallQty(int callQty) {

                                this.callQty = callQty;

                }

 

                public int getCost() {

                                return cost;

                }

 

                public void setCost(int cost) {

                                this.cost = cost;

                }

 

                public int getDataQty() {

                                return dataQty;

                }

 

                public void setDataQty(int dataQty) {

                                this.dataQty = dataQty;

                }

 

                public int getDuration() {

                                return duration;

                }

 

                public void setDuration(int duration) {

                                this.duration = duration;

                }

 

                public String getOfferName() {

                                return offerName;

                }

 

                public void setOfferName(String offerName) {

                                this.offerName = offerName;

                }

 

                public SimDetailsEntity getSim() {

                                return sim;

                }

 

                public void setSim(SimDetailsEntity sim) {

                                this.sim = sim;

                }

               

}

