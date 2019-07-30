package com.taskManagement.dev.repository.gestionSuivi;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import com.taskManagement.dev.dao.gestionSuivi.SousEtape;

@RepositoryRestResource
public interface SousEtapeRepository extends JpaRepository<SousEtape, Long> {

}
