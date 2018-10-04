package com.apap.tutorial4.service;
import com.apap.tutorial4.model.PilotModel;
import com.apap.tutorial4.repository.PilotDb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class PilotServiceImpl implements PilotService {
	@Autowired
	private PilotDb pilotDb;

	@Override
	public PilotModel getPilotDetailByLicenseNumber(String licenseNumber) {
		// TODO Auto-generated method stub
		return pilotDb.findByLicenseNumber(licenseNumber);
	}

	@Override
	public void addPilot(PilotModel pilot) {
		// TODO Auto-generated method stub
		pilotDb.save(pilot);
		
	}

	@Override
	public void deletePilot(Long idPilot) {
		// TODO Auto-generated method stub
		pilotDb.deleteById(idPilot);
		
	}
}
