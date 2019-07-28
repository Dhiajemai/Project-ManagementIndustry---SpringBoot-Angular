package com.taskManagement.dev.repository.gestionSuivi;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.taskManagement.dev.dao.gestionSuivi.EtatAvancement;

@Repository
public interface EtatAvancementRepository  extends JpaRepository<EtatAvancement, Long>{

}
