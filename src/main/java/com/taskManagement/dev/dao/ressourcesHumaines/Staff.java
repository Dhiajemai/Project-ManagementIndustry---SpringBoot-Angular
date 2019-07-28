package com.taskManagement.dev.dao.ressourcesHumaines;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Component
@Entity
public class Staff implements Serializable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long idStaff;
	private String libelleStaff;
	private String descStaff;
	private String listeNomStaff;

}
