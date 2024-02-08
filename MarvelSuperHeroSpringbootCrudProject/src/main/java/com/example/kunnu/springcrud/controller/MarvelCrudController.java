package com.example.kunnu.springcrud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.kunnu.springcrud.model.Characters;
import com.example.kunnu.springcrud.services.CRUDService;

@RestController
public class MarvelCrudController {
	//CRUD
	//CREATE API endpoint - POST 
	
	@Autowired
	CRUDService crudService;
	
	@PostMapping(path="create")
	public void createSuperHero(@RequestBody Characters superhero) {
		crudService.createSuperHero(superhero);
	}
	
	
	//READ API endpoint
	//localhost:8080/read?id=1
	@GetMapping("read")
	public Characters readSuperheroById(@RequestParam(name="id") int val)
	{
		return crudService.readSuperheroById(val);
	}
	
	
	
	//UPDATE API endpoint
	@PutMapping("update")
	public void updateSuperHeroHumanName(@RequestBody Characters superhero,@RequestParam(name="id") int id)
	{
		crudService.updateSuperHeroHumanName(superhero,id);
	}
	
	
	//DELETE API endpoint
	@DeleteMapping("delete")
	public void deleteSuperHero(@RequestParam(name ="id") int id) {
		crudService.deleteSuperHero(id);
	}

}
