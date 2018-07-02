package com.irwan.DoNi.services;



import java.util.Optional;

import org.springframework.stereotype.Service;

import com.irwan.DoNi.models.Ninja;
import com.irwan.DoNi.repositories.NinjaRepository;


@Service
public class NinjaService {

	public NinjaRepository ninjaRepo;
	public NinjaService(NinjaRepository ninjaRepo) {
		this.ninjaRepo = ninjaRepo;
	}
	
	public Long addNinja(Ninja ninja) {
		ninjaRepo.save(ninja);
		return ninja.getId();
	}
	
//	public Ninja getNinja(Long id) {
//		return ninjaRepo.findById(id);
//	}
	
	public Ninja findNinja(Long id) {
        Optional<Ninja> optionalNinja = ninjaRepo.findById(id);
        if(optionalNinja.isPresent()) {
            return optionalNinja.get();
        } else {
            return null;
        }
    }
	
	
	public void updateNinja(Ninja ninja) {
		ninjaRepo.save(ninja);
	}
	
	public void deleteNinja(Long id) {
		ninjaRepo.deleteById(id);
	}
}