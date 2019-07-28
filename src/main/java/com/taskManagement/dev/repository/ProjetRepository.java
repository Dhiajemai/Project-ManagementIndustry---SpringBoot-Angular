package com.taskManagement.dev.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.taskManagement.dev.dao.Projet;

@Repository
public interface ProjetRepository extends JpaRepository<Projet, Long>{

}
