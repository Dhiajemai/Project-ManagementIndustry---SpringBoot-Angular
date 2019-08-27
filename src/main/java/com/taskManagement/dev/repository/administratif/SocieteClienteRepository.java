package com.taskManagement.dev.repository.administratif;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.taskManagement.dev.dao.administratif.SocieteCliente;

@RepositoryRestResource
@CrossOrigin(origins= {"http://localhost:4200"})
public interface SocieteClienteRepository extends JpaRepository<SocieteCliente, Long>{

}
