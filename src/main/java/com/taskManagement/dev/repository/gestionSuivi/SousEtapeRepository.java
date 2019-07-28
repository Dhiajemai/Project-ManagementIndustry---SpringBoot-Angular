package com.taskManagement.dev.repository.gestionSuivi;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.taskManagement.dev.dao.gestionSuivi.SousEtape;

@Repository
public interface SousEtapeRepository extends JpaRepository<SousEtape, Long> {

}
