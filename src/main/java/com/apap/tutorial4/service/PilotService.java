package com.apap.tutorial4.service;

import com.apap.tutorial4.model.PilotModel;

public interface PilotService {
	PilotModel getPilotDetailByLicenseNumber(String licenseNumber);
	
	void addPilot(PilotModel pilot);
	
	//method untuk menghapus pilot
	void deletePilot(Long idPilot);
	
	//method untuk mengupdate pilot
	void updatePilot(PilotModel pilot, String licenseNumber);
}
