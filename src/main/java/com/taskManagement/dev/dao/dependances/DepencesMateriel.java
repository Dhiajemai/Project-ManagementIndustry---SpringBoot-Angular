package com.taskManagement.dev.dao.dependances;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.stereotype.Component;


@Component
@Entity
public class DepencesMateriel implements Serializable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long idDepences;
	private String libelleDepences;
	private double totDepences;

}
