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
public class Contrat implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long idContrat;
	private String libelleContrat;
	private String descriptionContrat;
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateDebutContrat;
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateFinContrat;
}
