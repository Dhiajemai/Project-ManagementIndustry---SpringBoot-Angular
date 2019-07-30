package com.taskManagement.dev.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import com.taskManagement.dev.dao.Projet;

@RepositoryRestResource
public interface ProjetRepository extends JpaRepository<Projet, Long>{

}
