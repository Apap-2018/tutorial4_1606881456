package com.apap.tutorial4.service;

import com.apap.tutorial4.model.FlightModel;

public interface FlightService {
	void addFlight(FlightModel flight);
	//method untuk delete flight
	void deleteFlight(Long flightId);
	
}
