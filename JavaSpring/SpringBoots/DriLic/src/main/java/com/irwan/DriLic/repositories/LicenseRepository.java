package com.irwan.DriLic.repositories;



import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.irwan.DriLic.models.License;


@Repository
public interface LicenseRepository extends CrudRepository<License, Long> {
}