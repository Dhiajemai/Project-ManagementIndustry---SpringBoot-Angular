package com.taskManagement.dev.dao.administratif;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.springframework.stereotype.Component;

import com.taskManagement.dev.dao.gestionSuivi.EtatAvancement;

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
public class RapportCommission implements Serializable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long idRapportCommission;
	private String nomRapportCommission;
	private String themeRapportCommission;
	private String descrTypeRaportCommission;
	private String typeRapportCommission;
	private String rapport;
	
	@ManyToOne
	@JoinColumn(name="id_commission")
	private Commission commission;

}
