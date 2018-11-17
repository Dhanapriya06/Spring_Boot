package com.infosys.sap.service;



 



import org.springframework.beans.factory.annotation.Autowired;



import org.springframework.stereotype.Service;



 



import com.infosys.sap.entity.SimDetailsEntity;



import com.infosys.sap.entity.SimOffersEntity;



import com.infosys.sap.exceptions.InvalidSimException;



import com.infosys.sap.repository.SimDetailsRepository;



import com.infosys.sap.repository.SimOffersRepository;



 



@Service



public class SimServiceImpl implements SimService{



               



                @Autowired



                SimDetailsRepository simDetailsRepo;



               



                @Autowired



                SimOffersRepository simOfferRepo;



               



                public SimDetailsEntity validate(Long simNumber,Long ServiceNumber) throws InvalidSimException ,Exception {



                                SimDetailsEntity sde =  simDetailsRepo.findBySimNumberAndServiceNumber(simNumber, ServiceNumber);



                                if(sde == null) {



                                                throw new InvalidSimException("SimService.InvalidSim");



                                }



                                else if(sde.getSimStatus().equals("active")) {



                                                throw new Exception("SimService.ActiveSim");



                                }



                                //else {



                                                //simDetailsRepo.updateSim(simNumber);



                                //}



                                return sde;



                }



               



                public Integer getSimId(Long simNumber,Long ServiceNumber) {



                                SimDetailsEntity sde =  simDetailsRepo.findBySimNumberAndServiceNumber(simNumber, ServiceNumber);



                                return sde.getSimId();



                }



               



                public SimOffersEntity getOffer(Integer simId) {



                                return simOfferRepo.findBySim_SimId(simId);



                }



               



                public void updateSimStatus(Long simNumber) {



                                simDetailsRepo.updateSim(simNumber);



                }



}



