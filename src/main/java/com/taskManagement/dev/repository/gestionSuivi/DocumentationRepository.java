package com.taskManagement.dev.repository.gestionSuivi;

import javax.swing.text.Document;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DocumentationRepository extends JpaRepository<Document, Long>{

}
