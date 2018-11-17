package com.infosys.sap.validation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import org.springframework.validation.Errors;

import org.springframework.validation.Validator;

import com.infosys.sap.model.Sim;

@Component

public class CustomValidation implements Validator {
	
	@Autowired
	Environment environment;

	@Override

	public boolean supports(Class<?> clazz) {

		return Sim.class.isAssignableFrom(clazz);

	}

	@Override

	public void validate(Object target, Errors errors) {

		Sim sim = (Sim) target;

		Long simNumber = sim.getSimNumber();

		Long servNum = sim.getServiceNumber();

		if (simNumber != null && simNumber.toString().length() != 13) {

			errors.rejectValue("simNumber", "SimNum.Invalid");

		}

		if (servNum != null && servNum.toString().length() != 10) {

			errors.rejectValue("serviceNumber", "ServiceNum.Invalid");

		}

	}

}
