package com.taskManagement.dev.dao.gestionSuivi;

import java.io.Serializable;
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
import lombok.NoArgsConstructor;
import lombok.ToString;


@Component
@Entity
@Data @NoArgsConstructor @AllArgsConstructor @ToString
public class SousEtape implements Serializable {

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

	/***** RELATION AVEC LA TABLE ETAT D'AVANCEMENT *****/
	@ManyToOne
	@JoinColumn(name = "etat_davancement")
	private EtatAvancement etatAvancement;

	/***** RELATION AVEC LA TABLE ETAPE *****/
	@ManyToOne
	@JoinColumn(name = "etape")
	private Etape etapeProjet;

	/***** RELATION AVEC LA TABLE DOCUMENTATION *****/
	@OneToMany(mappedBy = "sousEtape", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private Set<Documentation> documentation;

}
