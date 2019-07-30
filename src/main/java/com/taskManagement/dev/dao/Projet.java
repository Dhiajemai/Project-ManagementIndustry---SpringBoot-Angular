package com.taskManagement.dev.dao;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.stereotype.Component;

import com.taskManagement.dev.dao.administratif.Contrat;
import com.taskManagement.dev.dao.administratif.SocieteCliente;
import com.taskManagement.dev.dao.dependances.Logistique;
import com.taskManagement.dev.dao.gestionSuivi.EtatAvancement;
import com.taskManagement.dev.dao.gestionSuivi.Phase;
import com.taskManagement.dev.dao.ressourcesHumaines.Employee;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Component
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
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

	/***** RELATION AVEC LA TABLE PHASE *****/
	@OneToMany(mappedBy = "projet", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private Set<Phase> phases;

	/***** RELATION AVEC LA TABLE ETAT D'AVANCEMENT *****/
	@ManyToOne
	@JoinColumn(name = "id_etat_davancement")
	private EtatAvancement etatAvancement;

	@OneToMany(mappedBy = "projet", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private Set<Logistique> logistique;

	@ManyToOne
	@JoinColumn(name = "id_societe_cliente")
	private SocieteCliente societeCliente;

	@OneToOne(mappedBy = "projet")
	private Contrat contrat;

	@ManyToMany( mappedBy = "projet", fetch = FetchType.LAZY, cascade =CascadeType.ALL)
	private Set<Employee> employee;

}
