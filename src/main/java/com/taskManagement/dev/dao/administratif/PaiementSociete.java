package com.taskManagement.dev.dao.administratif;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Component
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class PaiementSociete implements Serializable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long idPaiement;
	private String libellePaiement;
	private double montantBrut;
	private double montantNet;
	private double montantTot;
	
	@ManyToOne
	@JoinColumn(name="id_Societe_Cliente")
	private SocieteCliente societeCliente;

}
