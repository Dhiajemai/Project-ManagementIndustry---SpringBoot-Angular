package com.taskManagement.dev.dao.gestionSuivi;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.stereotype.Component;


@Component
@Entity
public class SousEtape implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long idSousEtape;
	private String desSousEtape;
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateDebutSousEtape;
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateFinSousEtape;
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateLimiteSousEtape;
	

}
