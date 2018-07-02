package com.irwan.DoNi.services;


import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.irwan.DoNi.models.Dojo;
import com.irwan.DoNi.repositories.DojoRepository;


@Service
public class DojoService {
	private DojoRepository dojoRepo;
	
	public DojoService(DojoRepository dojoRepo) {
		this.dojoRepo = dojoRepo;
	}
	
	public List<Dojo> showDojos(){
		return (List<Dojo>) dojoRepo.findAll();
	}
	
	public Long addDojo(Dojo dojo) {
		dojoRepo.save(dojo);
		return dojo.getId();
	}
	
//	public Dojo getDojo(Long id) {
//		return dojoRepo.findById(id);
//	}
	
	public Dojo findDojo(Long id) {
        Optional<Dojo> optionalDojo = dojoRepo.findById(id);
        if(optionalDojo.isPresent()) {
            return optionalDojo.get();
        } else {
            return null;
        }
    }
	
	public void updateDojo(Dojo dojo) {
		dojoRepo.save(dojo);
	}
	
	public void destroyDojo(Long id) {
		dojoRepo.deleteById(id);
	}
	
}