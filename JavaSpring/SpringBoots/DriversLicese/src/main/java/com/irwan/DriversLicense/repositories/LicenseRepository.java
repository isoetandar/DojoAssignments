package com.irwan.DriversLicense.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.irwan.DriversLicense.models.License;

@Repository
public interface LicenseRepository extends CrudRepository<License, Long> {

}