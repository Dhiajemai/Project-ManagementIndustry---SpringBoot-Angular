package com.taskManagement.dev.dao.ressourcesHumaines;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("ProjectManager")
public class ProjectManager extends Employee {
	
	private int projetDirigeOilGaz;
	private int projetDirigeTurbines;
	private int projetDirigeTot;
	private int nbreContratSigner;

}
