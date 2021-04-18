package com.crack.assignment3.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.narwal.assignment3.models.State;

@Service
public class StateServiceImpl implements StateService {

	private static final State[] statesArray = new State[] { new State("501", "NY", "Holtsville", "USA"),
			new State("544", "NY", "Holtsville", "USA"), new State("646", "PR", "Dorado", "USA"),
			new State("682", "PR", "Mayaguez", "USA"), new State("692", "PR", "Vega Alta", "USA") };
	
	private static final ArrayList<State> states = new ArrayList<>(Arrays.asList(statesArray));
	
	private static final Map<String, State> stateMap = states.stream()
			.collect(Collectors.toMap(State::getZipCode, state -> state));

	@Override
	public State getStateByZipCode(String zipcode) {
		return stateMap.get(zipcode);
	}

	@Override
	public void AddState(State state) {
		stateMap.put(state.getZipCode(), state);
	}

	@Override
	public State deleteStatebyZip(String zipcode) {
		State state = stateMap.remove(zipcode);
		return state;
	}

}
