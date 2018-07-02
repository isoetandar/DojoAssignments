package com.irwan.DoNi.repositories;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.irwan.DoNi.models.Dojo;


@Repository
public interface DojoRepository extends CrudRepository<Dojo, Long> {

}