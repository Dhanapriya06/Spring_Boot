package com.infosys.sap.controller;

 

import javax.servlet.http.HttpSession;

import javax.validation.Valid;

 

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import org.springframework.ui.ModelMap;

import org.springframework.validation.BindingResult;

import org.springframework.web.bind.annotation.ModelAttribute;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.servlet.ModelAndView;

 

import com.infosys.sap.entity.CustomerAddressEntity;

import com.infosys.sap.model.Address;

import com.infosys.sap.service.AddressService;

import com.infosys.sap.service.CustomerService;

import com.infosys.sap.validation.CustomerAddress_Validation;

 

 

@Controller

public class AddressController {

               

                @Autowired

                CustomerAddress_Validation addValidate;

               

                @Autowired

                AddressService addServ;

               

                @Autowired

                CustomerService custService;

               

                @RequestMapping(value = "/address")

                public ModelAndView getAddress() {

                                return new ModelAndView("address","command",new Address());

                }

               

                @RequestMapping(value = "/addressValidate", method = RequestMethod.POST)

                public ModelAndView validateAddress(@Valid @ModelAttribute("command") Address address,

                                                BindingResult result, ModelMap map,HttpSession httpSession) {

                               

                                ModelAndView modelAndView = new ModelAndView();

                                addValidate.validate(address, result);

                                if(result.hasErrors()) {

                                                modelAndView = new ModelAndView("address","command",address);

                                }

                                else {

                                                try {

                                                               

                                                                Integer newAddId = 0;

                                                                Long custId = (Long)httpSession.getAttribute("uniqueIdNumber");                                        

                                                                Integer addId = custService.getCustomerAddressId(custId);

                                                                if(addId == null) {

                                                                                CustomerAddressEntity cae = new CustomerAddressEntity();

                                                                                cae.setAddress(address.getAddress());

                                                                                cae.setCity(address.getCity());

                                                                                cae.setPincode(address.getPincode());

                                                                                cae.setState(address.getState());

                                                                                newAddId = addServ.putAddress(cae);

                                                                                custService.updateCustomerAddress(custId, newAddId);

                                                                }

                                                                else {

                                                                                addServ.update(addId, address);

                                                                }                             

                                                               

                                                               

                                                                modelAndView = new ModelAndView("address","command",address);

                                                                modelAndView.addObject("message2", "Address successfully updated");

                                                }

                                                catch(Exception e) {

                                                                e.printStackTrace();

                                                                modelAndView = new ModelAndView("address");

                                                                modelAndView.addObject("message1", e.getMessage());

                                                }

                                }

                               

                                return modelAndView;

                }

 

}

