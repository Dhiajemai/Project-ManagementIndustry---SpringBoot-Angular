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

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Component
@Entity
@Data @NoArgsConstructor @AllArgsConstructor @ToString
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
	
	/***** RELATION AVEC LA TABLE ETAT D'AVANCEMENT *****/
	@ManyToOne
	@JoinColumn(name="etat_davancement")
	private EtatAvancement etatAvancement;
	
	/***** RELATION AVEC LA TABLE SOUS-ETAPE *****/
	@OneToMany(mappedBy="etapeProjet",fetch=FetchType.LAZY,cascade=CascadeType.ALL)
	private Set<SousEtape> sousetapes;
	
	/***** RELATION AVEC LA TABLE PHASE *****/
	@ManyToOne
	@JoinColumn(name="phase")
	private Phase phase;

}
