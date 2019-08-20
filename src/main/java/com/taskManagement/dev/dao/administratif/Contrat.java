package com.taskManagement.dev.dao.administratif;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.stereotype.Component;

import com.taskManagement.dev.dao.Projet;

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
public class Contrat implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long idContrat;
	private String libelleContrat;
	private String descriptionContrat;
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateDebutContrat;
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateFinContrat;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id_projet")
	private Projet projet;
}
