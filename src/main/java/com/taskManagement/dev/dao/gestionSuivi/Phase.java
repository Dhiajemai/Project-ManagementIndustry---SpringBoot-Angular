package com.taskManagement.dev.dao.gestionSuivi;

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
public class Phase implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long idPhase;
	private String DesPhase;
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateDebutPhase;
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateFinPhase;
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateLimitePhase;

}
