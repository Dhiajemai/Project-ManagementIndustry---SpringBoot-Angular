package com.taskManagement.dev.repository.ressoucesHumaines;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;

import com.taskManagement.dev.dao.ressourcesHumaines.Roles;

@RepositoryRestController
public interface RolesRepository extends JpaRepository<Roles, Long> {
	

}
