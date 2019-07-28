package com.taskManagement.dev.dao.administratif;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Component
@Entity
public class SocieteCliente implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long idSociete;
	private String nomSociete;
	private String prenomSociete;
	private String adresseSociete;
	private long telSociete;
	private String emailSociete;
	private long FaxSociete;

}
