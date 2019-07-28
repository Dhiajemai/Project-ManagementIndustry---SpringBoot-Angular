package com.taskManagement.dev.repository.gestionSuivi;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.taskManagement.dev.dao.gestionSuivi.Etape;

@Repository
public interface EtapeRepository extends JpaRepository<Etape, Long>{

}
