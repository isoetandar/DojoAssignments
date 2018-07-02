package com.irwan.DriversLicense.services;

import com.irwan.DriversLicense.models.License;
import com.irwan.DriversLicense.repositories.LicenseRepository;

public class LicenseService {
	private final LicenseRepository licenseRepository;
	
	public LicenseService(LicenseRepository licenseRepository) {
		this.licenseRepository = licenseRepository;
	}
	
	//CRUD operation (add, retrieve, update and delete operation)
	public License add(License l) {
		return licenseRepository.save(l);
	}
	

}
