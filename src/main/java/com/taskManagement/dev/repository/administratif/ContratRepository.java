package com.taskManagement.dev.repository.administratif;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.taskManagement.dev.dao.administratif.Contrat;

@RepositoryRestResource
public interface ContratRepository extends JpaRepository<Contrat, Long> {

}
