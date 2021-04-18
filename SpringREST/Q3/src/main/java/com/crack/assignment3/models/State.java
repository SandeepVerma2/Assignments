package com.crack.assignment3.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class State {

	private String zipCode;
	@JsonProperty("state")
	private String stateName;
	@JsonProperty("city")
	private String cityName;
	@JsonProperty("country")
	private String countryName;

	public State(String zipCode, String stateName, String cityName, String countryName) {
		super();
		this.zipCode = zipCode;
		this.stateName = stateName;
		this.cityName = cityName;
		this.countryName = countryName;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

}
