package com.taskManagement.dev.dao;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.springframework.stereotype.Component;


@Component
@Entity
public class Projet implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long idProjet;
	private String descriptionProjet;
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateDebProjet;
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateFinProjet;
	private String paysProjet;
	private String villeProjet;
	private double coutProjet;
	
	
}


