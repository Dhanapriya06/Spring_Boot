package com.infosys.sap.service;

 

import com.infosys.sap.entity.SimDetailsEntity;

import com.infosys.sap.entity.SimOffersEntity;

import com.infosys.sap.exceptions.InvalidSimException;

 

public interface SimService {

                public SimDetailsEntity validate(Long simNumber,Long ServiceNumber) throws InvalidSimException ,Exception;

                public Integer getSimId(Long simNumber,Long ServiceNumber);

                public SimOffersEntity getOffer(Integer simId) ;

                public void updateSimStatus(Long simNumber);

}

