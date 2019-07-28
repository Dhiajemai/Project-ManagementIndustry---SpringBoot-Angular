package com.taskManagement.dev.repository.gestionSuivi;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.taskManagement.dev.dao.gestionSuivi.Phase;

@Repository
public interface PhaseRepository extends JpaRepository<Phase, Long>{

}
