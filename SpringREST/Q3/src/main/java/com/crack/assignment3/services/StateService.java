package com.crack.assignment3.services;

import com.narwal.assignment3.models.State;

public interface StateService {

	public abstract State getStateByZipCode(String zipcode);

	public abstract void AddState(State state);

	public abstract State deleteStatebyZip(String zipcode);

}
