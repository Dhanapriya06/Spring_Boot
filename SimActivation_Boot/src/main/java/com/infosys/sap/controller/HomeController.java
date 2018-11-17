package com.infosys.sap.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;

import com.infosys.sap.model.Sim;

@Controller

@RequestMapping("/")

public class HomeController {

	@RequestMapping(method = RequestMethod.GET)

	public String loadHomePage(Model model) {
		Sim sim = new Sim();
		model.addAttribute("command", sim);
		return "portalHome";
	}

}
