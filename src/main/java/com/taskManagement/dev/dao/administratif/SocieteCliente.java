package com.taskManagement.dev.dao.administratif;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

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
public class SocieteCliente implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long idSociete;
	private String nomSociete;
	private String prenomSociete;
	private String adresseSociete;
	private long telSociete;
	private String emailSociete;
	private long FaxSociete;

	@OneToMany(mappedBy = "societeCliente", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private Set<Projet> projet;

	@OneToMany(mappedBy = "societeCliente", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private Set<PaiementSociete> paiementsociete;

	@OneToMany(mappedBy = "societeCliente", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private Set<Commission> commission;
	
	@OneToMany(mappedBy = "societeCliente", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private Set<AppelDoffre> appelDoffres;

}
