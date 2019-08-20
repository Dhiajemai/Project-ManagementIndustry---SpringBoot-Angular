package com.taskManagement.dev.dao.administratif;

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
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Commission implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long idCommission;
	private String descCommission;
	private String equipeCommission;
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateCommission;
	private String resultatCommission;

	@OneToMany(mappedBy = "commission", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private Set<RapportCommission> rapportCommission;

	@ManyToOne
	@JoinColumn(name = "id_Societe")
	private SocieteCliente societeCliente;
}
