package com.example.kunnu.springcrud.services;

import java.security.PublicKey;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.kunnu.springcrud.model.Characters;
import com.example.kunnu.springcrud.repository.SuperHeroCharacterRepository;

@Service
public class CRUDService {
	
	@Autowired
	SuperHeroCharacterRepository superHeroCharacterRepository;
	
	
	//For Create
	public void createSuperHero(Characters character)
	{
		superHeroCharacterRepository.save(character);
	}
	
	
	//For Read
	public Characters readSuperheroById(int val) {
		return superHeroCharacterRepository.findById(val).get();
	}


	public void updateSuperHeroHumanName(Characters superhero, int id) {
		
		Characters superHeroToBeUpdated=readSuperheroById(id);
		superHeroToBeUpdated.setHumanName(superhero.getHumanName());
		superHeroCharacterRepository.save(superHeroToBeUpdated);
	}



	
	//For Delete
		public void deleteSuperHero(int id) {
		superHeroCharacterRepository.deleteById(id);
	}
	

}
