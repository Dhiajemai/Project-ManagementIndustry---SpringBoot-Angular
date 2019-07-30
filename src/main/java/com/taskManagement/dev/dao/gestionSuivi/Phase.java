package com.taskManagement.dev.dao.gestionSuivi;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import java.util.Set;

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

import com.taskManagement.dev.dao.Projet;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Component
@Entity
@Data @NoArgsConstructor @AllArgsConstructor @ToString
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
	
	
	/***** RELATION AVEC LA TABLE ETAT D'AVANCEMENT *****/
	@ManyToOne
	@JoinColumn(name="etat_davancement")
	private EtatAvancement etatAvancement;
	
	/***** RELATION AVEC LA TABLE ETAPE *****/
	@OneToMany(mappedBy="phase",fetch=FetchType.LAZY,cascade=CascadeType.ALL)
	private Set<Etape> etapes;
	
	/***** RELATION AVEC LA TABLE PROJET *****/
	@ManyToOne
	@JoinColumn(name="Projet")
	private Projet projet;
	
	
}
