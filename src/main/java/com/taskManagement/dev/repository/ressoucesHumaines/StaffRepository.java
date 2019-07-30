package com.taskManagement.dev.repository.ressoucesHumaines;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.taskManagement.dev.dao.ressourcesHumaines.Staff;

@RepositoryRestResource
public interface StaffRepository extends JpaRepository<Staff, Long> {

}
