package com.taskManagement.dev.dao.administratif;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Component
@Entity
public class PaiementSociete implements Serializable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long idPaiement;
	private String libellePaiement;
	private double montantBrut;
	private double montantNet;
	private double montantTot;

}
