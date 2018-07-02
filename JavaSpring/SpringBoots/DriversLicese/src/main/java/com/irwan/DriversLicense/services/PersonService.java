package com.irwan.DriversLicense.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.irwan.DriversLicense.models.Person;
import com.irwan.DriversLicense.repositories.PersonRepository;

@Service
public class PersonService {
	private final PersonRepository personRepository;
	
	public PersonService(PersonRepository personRepository) {
		this.personRepository = personRepository;
	}
	
	// returns all persons
    public List<Person> allPersons() {
        return personRepository.findAll();
    }
    
    // add a person
    public Person add(Person p) {
    	return personRepository.save(p);
    }
    
    //retrieve a person
    public Person findPerson(Long id) {
    	Optional<Person> optionalPerson = personRepository.findById(id);
    	if(optionalPerson.isPresent()) {
    		return optionalPerson.get();
    	} else {
    		return null;
    	}
    }
    
    // remove a person
    public void removePerson(Long id) {
    	personRepository.deleteById(id);
    }
    
    // update a person information
    public Person updatePerson(Person person) {
    	return personRepository.save(person);
    }
  
}