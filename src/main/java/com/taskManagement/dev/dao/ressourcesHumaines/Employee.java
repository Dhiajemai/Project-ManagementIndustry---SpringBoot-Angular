package com.taskManagement.dev.dao.ressourcesHumaines;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.stereotype.Component;

import com.taskManagement.dev.dao.Projet;

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
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(discriminatorType = DiscriminatorType.STRING, name = "Post_TYPE")
public class Employee implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long idEmp;
	private String nomEmp;
	private String prenomEmp;
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateNaissEmp;
	private String adresseEmp;
	private long teEleEmp;
	private String photo;
	private String posteEmp;
	private String userName;
	private String password;
	
	@ManyToMany(fetch = FetchType.LAZY, cascade=CascadeType.ALL)
	private Set<Roles> roles;

	@ManyToOne
	@JoinColumn(name = "id_staff")
	private Staff staff;

	@ManyToMany(fetch = FetchType.LAZY, cascade=CascadeType.ALL)
	@JoinTable(name = "Employe_projet", joinColumns = { @JoinColumn(name = "idEmp") }, inverseJoinColumns = {
			@JoinColumn(name = "idProjet") })
	private Set<Projet> projet;

}
