package com.infosys.sap.model;

import javax.validation.constraints.NotNull;

public class Sim {

	@NotNull(message = "Enter service number")

	private Long serviceNumber;

	@NotNull(message = "Enter sim number")

	private Long simNumber;

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

}
