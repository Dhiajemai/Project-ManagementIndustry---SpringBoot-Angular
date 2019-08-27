package com.taskManagement.dev.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.taskManagement.dev.dao.Projet;

@RepositoryRestResource
@CrossOrigin(origins= {"http://localhost:4200"})
public interface ProjetRepository extends JpaRepository<Projet, Long>{

}
