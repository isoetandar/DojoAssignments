package com.irwan.beltExam1.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.irwan.beltExam1.models.Idea;
import com.irwan.beltExam1.repositories.IdeaRepository;


@Service
public class IdeaService {
	
	public IdeaRepository ideaRepo;
	public IdeaService(IdeaRepository ideaRepo) {
		this.ideaRepo = ideaRepo;
	}
	
	public Long addIdea(Idea idea) {
		ideaRepo.save(idea);
		return idea.getId();
	}
	
	//retrieves all ideas
	public List<Idea> findAllIdeas() {
		return ideaRepo.findAll();
	}
	
	// retrieves an idea
    public Idea findIdea(Long id) {
        Optional<Idea> optionalIdea = ideaRepo.findById(id);
        if(optionalIdea.isPresent()) {
            return optionalIdea.get();
        } else {
            return null;
        }
    }
    
	public void updateIdea(Idea idea) {
		ideaRepo.save(idea);
	}
	
	public void deleteIdea(Long id) {
		ideaRepo.deleteById(id);
	}
}