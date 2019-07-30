package com.taskManagement.dev.repository.dependances;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.taskManagement.dev.dao.dependances.Logistique;

@RepositoryRestResource
public interface LogistiqueRepository extends JpaRepository<Logistique, Long> {

}
