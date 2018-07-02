package com.irwan.languages.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.irwan.languages.models.Language;
import com.irwan.languages.repositories.LanguageRepository;

@Service
public class LanguageService {
	private final LanguageRepository languageRepository;
	
	public LanguageService(LanguageRepository languageRepository) {
		this.languageRepository = languageRepository;
	}
	
	// returns all the languages
    public List<Language> allLanguages() {
    	return languageRepository.findAll();
    }
    // add a language
    public Language addLanguage(Language l) { //change from 'create' to 'add' language
    										//here we don't 'create' but 'add' a language into system.
        return languageRepository.save(l);
    }
    
    // retrieves a language
    public Language findLanguage(Long id) {
        Optional<Language> optionalLanguage = languageRepository.findById(id);
        if(optionalLanguage.isPresent()) {
            return optionalLanguage.get();
        } else {
            return null;
        }
    }
    //delete a language 
    public void deleteLanguage(Long id) {
    	languageRepository.deleteById(id);
    }
    //update a language
    public Language updateLanguage(Language b) {
    	return languageRepository.save(b);
    }
}
