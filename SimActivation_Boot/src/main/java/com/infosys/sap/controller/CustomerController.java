package com.infosys.sap.controller;

 

import java.util.Date;

 

import javax.servlet.http.HttpSession;

import javax.validation.Valid;

 

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import org.springframework.ui.ModelMap;

import org.springframework.validation.BindingResult;

import org.springframework.web.bind.annotation.ModelAttribute;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.bind.annotation.SessionAttributes;

import org.springframework.web.servlet.ModelAndView;

 

import com.infosys.sap.entity.CustomerEntity;

import com.infosys.sap.model.Customer;

import com.infosys.sap.model.CustomerDetails;

import com.infosys.sap.model.CustomerID;

import com.infosys.sap.service.CustomerService;

import com.infosys.sap.service.SimService;

import com.infosys.sap.validation.Customer_Details_Validation;

import com.infosys.sap.validation.Validate_Email_DOB;

 

@Controller

@SessionAttributes({"simId","uniqueIdNumber","emailAddress","dateOfBirth","firstName","lastName"})

public class CustomerController {

               

                @Autowired

                SimService simService;

               

                @Autowired

                CustomerService custService;

               

                @Autowired

                Validate_Email_DOB valEmailDob;

               

                @Autowired

                Customer_Details_Validation custValidate;

               

                @RequestMapping(value = "/customerValidate")

                public ModelAndView loadCustomer() {

                                return new ModelAndView("customerValidation","command",new Customer());

                }

               

                @RequestMapping(value = "/custValidate", method = RequestMethod.POST)

                public ModelAndView validateCustomer(@Valid @ModelAttribute("command") Customer customer,

                                                BindingResult result, ModelMap map,HttpSession httpSession) {

                               

                                ModelAndView modelAndView = new ModelAndView();

                                valEmailDob.validate(customer, result);

                                if(result.hasErrors()) {

                                                modelAndView = new ModelAndView("customerValidation","command",customer);

                                }

                                else {

                                                try {

                                                                //CustomerIdentityEntity cie = custService.getCustomerIdDetails(customer.getEmailAddress(), customer.getDateOfBirth());

                                                                CustomerEntity ce = custService.getCustomerIdDetails(customer.getEmailAddress(), customer.getDateOfBirth(),(Integer)httpSession.getAttribute("simId"));

                                                                modelAndView = new ModelAndView("customerValidation","command",customer);

                                                                httpSession.setAttribute("uniqueIdNumber", ce.getUniqueIdNumber());

                                                                httpSession.setAttribute("emailAddress", ce.getEmailAddress());

                                                                httpSession.setAttribute("dateOfBirth", ce.getDateOfBirth());

                                                                modelAndView.addObject("message2", "success");

                                                }

                                                catch(Exception e) {

                                                                e.printStackTrace();

                                                                modelAndView = new ModelAndView("customerValidation");

                                                                modelAndView.addObject("message1", e.getMessage());

                                                }

                                }

                               

                                return modelAndView;

                }

               

                @RequestMapping(value = "/personalDetails")

                public ModelAndView loadDetails(HttpSession httpSession,ModelMap model) {

                                ModelAndView modelAndView = new ModelAndView("personalDetails","command",new CustomerDetails());

                                modelAndView.addObject("emailAddress", httpSession.getAttribute("emailAddress"));

                                modelAndView.addObject("dateOfBirth", httpSession.getAttribute("dateOfBirth"));

                                return modelAndView;

                }

               

                @RequestMapping(value = "/verifyDetails", method = RequestMethod.POST)

                public ModelAndView verifyCustomer(@Valid @ModelAttribute("command") CustomerDetails customer,

                                                BindingResult result, ModelMap map,HttpSession httpSession) {

                               

                                ModelAndView modelAndView = new ModelAndView();

                                customer.setEmailAddress((String)httpSession.getAttribute("emailAddress"));

                                customer.setUniqueIdNumber((Long)httpSession.getAttribute("uniqueIdNumber"));

                               

                               

                               

                                custValidate.validate(customer, result);

                               

                                if(result.hasErrors()) {

                                                modelAndView = new ModelAndView("personalDetails","command",customer);

                                }

                                else {

                                                try {

                                                                custService.verifyCustomer(customer);

                                                                modelAndView = new ModelAndView("personalDetails","command",customer);

                                                                httpSession.setAttribute("firstName", customer.getFirstName());

                                                                httpSession.setAttribute("lastName", customer.getLastName());

                                                                modelAndView.addObject("message2", "success");

                                                               

                                                               

                                                }

                                                catch(Exception e) {

                                                                e.printStackTrace();

                                                                modelAndView = new ModelAndView("personalDetails","command",customer);

                                                                modelAndView.addObject("message1", e.getMessage());

                                                }

                                }

                                return modelAndView;

                }

               

                @RequestMapping(value = "/idproof")

                public ModelAndView loadId(ModelMap map,HttpSession httpSession) {

                                return new ModelAndView("idproof","command",new CustomerID());

                }

               

                @RequestMapping(value = "/idValidate", method = RequestMethod.POST)

                public ModelAndView verifyID(@Valid @ModelAttribute("command") CustomerID customer,

                                                BindingResult result, ModelMap map,HttpSession httpSession) {

                               

                                ModelAndView modelAndView = new ModelAndView();                           

                                                               

                                if(result.hasErrors()) {

                                                modelAndView = new ModelAndView("idproof","command",customer);

                                }

                                else {

                                                try {

               

                                                                if(customer.getUniqueIdNumber() == null || customer.getUniqueIdNumber().longValue() != (long)httpSession.getAttribute("uniqueIdNumber")) {

                                                                                throw new Exception("Unique Id mismatch");

                                                                }

                                                                if(customer.getFirstName().isEmpty() || customer.getFirstName() == null || !customer.getFirstName().equals((String)httpSession.getAttribute("firstName"))) {

                                                                                throw new Exception("First name mismatch");

                                                                }

                                                                if(customer.getLastName().isEmpty() || customer.getLastName() == null || !customer.getLastName().equals((String)httpSession.getAttribute("lastName"))) {

                                                                                throw new Exception("Last name mismatch");

                                                                }

                                                               

                                                               

                                                                if(customer.getDateOfBirth() != null) {

                                                                                String d1 = customer.getDateOfBirth();

                                                                                Date d2 = (Date)httpSession.getAttribute("dateOfBirth");

                                                                                if(!d1.equals(d2.toString())) {

                                                                                                throw new Exception("DOB mismatch. Enter in YYYY-MM-dd format");

                                                                                }

                                                                }

                                                                modelAndView = new ModelAndView("idproof","command",customer);

                                                                modelAndView.addObject("message2", "ID validation Successfull");

                                                }

                                                catch(Exception e) {

                                                                e.printStackTrace();

                                                                modelAndView = new ModelAndView("idproof");

                                                                modelAndView.addObject("message1", e.getMessage());

                                                }

                                }

                               

                                return modelAndView;

                }

               

                @RequestMapping(value = "/summary")

                public ModelAndView summary(HttpSession httpSession) {

                                ModelAndView modelAndView = new ModelAndView("summary","command",new CustomerDetails());

                                modelAndView.addObject("firstName", httpSession.getAttribute("firstName"));

                                modelAndView.addObject("lastName", httpSession.getAttribute("lastName"));

                                modelAndView.addObject("emailAddress", httpSession.getAttribute("emailAddress"));

                                modelAndView.addObject("dateOfBirth", httpSession.getAttribute("dateOfBirth"));

                                return modelAndView;

                }

               

                @RequestMapping(value = "/complete",method = RequestMethod.POST)

                public ModelAndView summaryComplete( @ModelAttribute("command") CustomerDetails customer,

                                                BindingResult result, ModelMap map,HttpSession httpSession) {

                                ModelAndView modelAndView = new ModelAndView("summary","command",customer);

                                if(customer.isConfirm() == true) {

                                                simService.updateSimStatus((long)httpSession.getAttribute("simNumber"));

                                                modelAndView.addObject("message2", "Activation Successfull");

                                }

                                else {

                                                modelAndView.addObject("message2", "Please check check box");

                                }

                                return modelAndView;

                }

               

}

