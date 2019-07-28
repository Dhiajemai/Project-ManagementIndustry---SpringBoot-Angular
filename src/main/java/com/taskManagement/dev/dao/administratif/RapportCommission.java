package com.taskManagement.dev.dao.administratif;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Component
@Entity
public class RapportCommission implements Serializable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long idRapportCommission;
	private String nomRapportCommission;
	private String themeRapportCommission;
	private String descrTypeRaportCommission;
	private String typeRapportCommission;
	private String rapport;

}
