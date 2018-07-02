package com.irwan.DriLic.repositories;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.irwan.DriLic.models.Person;



@Repository
public interface PersonRepository extends CrudRepository<Person, Long> {
}