package com.taskManagement.dev.repository.gestionSuivi;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import com.taskManagement.dev.dao.gestionSuivi.Documentation;

@RepositoryRestResource
public interface DocumentationRepository extends JpaRepository<Documentation, Long> {

}
