package com.taskManagement.dev.dao.ressourcesHumaines;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Ouvrier")
public class Ouvrier extends Employee{
	
	private int experienceTot;
	private int experienceOilGaz;
	private int experienceTurbines;

}
