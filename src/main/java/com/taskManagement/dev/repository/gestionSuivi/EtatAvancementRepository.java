package com.taskManagement.dev.repository.gestionSuivi;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.taskManagement.dev.dao.gestionSuivi.EtatAvancement;


@CrossOrigin(origins= {"http://localhost:4200"})
public interface EtatAvancementRepository extends JpaRepository<EtatAvancement, Long>{

}
