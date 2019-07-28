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
public class Etape implements Serializable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long idEtape;
	private String descEtape;
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateDebutEtape;
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateFinEtape;
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateLimiteEtape;

}
