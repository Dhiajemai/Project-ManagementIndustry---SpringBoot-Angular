package com.taskManagement.dev.dao.gestionSuivi;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Component
@Entity
public class EtatAvancement implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long idEtatAvancement;
	private String libelleAvancement;
	private String descriAvanacement;

}
