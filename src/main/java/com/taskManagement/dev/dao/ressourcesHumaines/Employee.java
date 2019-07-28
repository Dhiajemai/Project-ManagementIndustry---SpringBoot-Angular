package com.taskManagement.dev.dao.ressourcesHumaines;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.stereotype.Component;


@Component
@Entity
public class Employee implements Serializable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long idEmp;
	private String nomEmp;
	private String prenomEmp;
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateNaissEmp;
	private String adresseEmp;
	private long teleEmp;
	private String photo;
	private String posteEmp;

}
