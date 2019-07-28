package com.taskManagement.dev.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.taskManagement.dev.dao.Projet;
import com.taskManagement.dev.repository.ProjetRepository;

@CrossOrigin
@RestController
@RequestMapping(path = "/projet")
public class ProjetController {

	@Autowired
	private ProjetRepository rep;

	@PostMapping()
	public @ResponseBody Projet addProject(@RequestBody Projet p) {
		
		
		return rep.save(p);
	}

	@PutMapping
	public @ResponseBody Projet updateProject(@RequestBody Projet p) {
		return rep.save(p);
	}

	@GetMapping(path = "/all")
	public @ResponseBody List<Projet> getAllProject() {
		return rep.findAll();
	}
	


}
