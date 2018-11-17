package com.infosys.sap.controller;

import javax.servlet.http.HttpSession;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.MessageSourceAware;
import org.springframework.core.env.Environment;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;

import org.springframework.validation.BindingResult;

import org.springframework.web.bind.annotation.ModelAttribute;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.bind.annotation.SessionAttributes;

import org.springframework.web.servlet.ModelAndView;

import com.infosys.sap.entity.SimOffersEntity;

import com.infosys.sap.exceptions.InvalidSimException;

import com.infosys.sap.model.Sim;

import com.infosys.sap.service.SimService;

import com.infosys.sap.validation.CustomValidation;

@Controller

@SessionAttributes({ "simId", "simNumber" })

public class SimController {
	
	@Autowired
	SimService simService;

	@Autowired
	Environment environment;

	@Autowired
	CustomValidation customValidation;

	@RequestMapping(value = "/simValidation", method = RequestMethod.GET)

	public ModelAndView getLoginDetails(ModelMap model, HttpSession httpSession) {

		return new ModelAndView("simValidation", "command", new Sim());

	}

	@RequestMapping(value = "simValidate", method = RequestMethod.POST)

	public ModelAndView validateSim(@Valid @ModelAttribute("command") Sim sim, BindingResult result,

			ModelMap model, HttpSession httpSession) {

		customValidation.validate(sim, result);
		//messageSource.getMessage("test", new Object[0], new Locale("en"));
		ModelAndView modelAndView = new ModelAndView();

		if (result.hasErrors()) {

			modelAndView = new ModelAndView("simValidation", "command", sim);

		}

		else {

			try {

				Long serviceNo = sim.getServiceNumber();

				Long simNum = sim.getSimNumber();

				httpSession.setAttribute("simNumber", simNum);

				simService.validate(simNum, serviceNo);

				modelAndView = new ModelAndView("simValidation", "command", sim);

				modelAndView.addObject("successMessage", "Valid details. Welcome!!.");

				Integer sId = simService.getSimId(sim.getSimNumber(), sim.getServiceNumber());
				System.out.println(sId);

				httpSession.setAttribute("simId", sId);

			}

			catch (InvalidSimException e) {

				e.printStackTrace();

				modelAndView = new ModelAndView("simValidation");

				modelAndView.addObject("message",
						"Invalid details, please check again SIm Number / Service Number!!..");

			}

			catch (Exception e) {

				e.printStackTrace();

				// if (e.getMessage().contains("SimService")) {

				modelAndView = new ModelAndView("simValidation");

				// }

				modelAndView.addObject("message", "SIM already Active");

				//Integer sId = simService.getSimId(sim.getSimNumber(), sim.getServiceNumber());

				//httpSession.setAttribute("simId", sId);

				// System.out.println("*****************************"+sId);

			}

		}

		return modelAndView;

	}

	@RequestMapping(value = "/offer", method = RequestMethod.GET)

	public ModelAndView viewOffers(ModelMap model, HttpSession httpSession) {

		ModelAndView modelAndView = new ModelAndView("offer");

		Integer simId1 = (Integer) httpSession.getAttribute("simId");
		System.out.println(simId1);

		SimOffersEntity soe = simService.getOffer(simId1);
		System.out.println(soe.getCallQty()+" "+soe.getOfferName());

		modelAndView.addObject("callQty", soe.getCallQty());

		if (soe.getOfferName().contains("data")) {

			modelAndView.addObject("dataQty", soe.getDataQty());

		}

		return modelAndView;

	}

	

}
