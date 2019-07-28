package com.taskManagement.dev.dao.gestionSuivi;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.springframework.stereotype.Component;

@Component
@Entity
public class Documentation implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long idDocument;
	private String nomDocument;
	private String descDocument;
	private String typeDocument;
	private String cheminDocument;

}
