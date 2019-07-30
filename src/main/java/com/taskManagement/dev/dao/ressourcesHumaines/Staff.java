package com.taskManagement.dev.dao.ressourcesHumaines;

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

@Component
@Entity
public class Staff implements Serializable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long idStaff;
	private String libelleStaff;
	private String descStaff;
	private String specialite;
	
	@OneToMany(mappedBy="staff",fetch=FetchType.LAZY,cascade=CascadeType.ALL)
	private Set<Employee> employee;

}
