package com.taskManagement.dev.dao.administratif;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.stereotype.Component;

@Component
@Entity
public class AppelDoffre implements Serializable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long idAppele;
	private String libelleAppel;  
	private String nomProjetAppel;
	private String lieuAppelDoffre;
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateDebAppel;
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateLimiteAppel;
	

}
