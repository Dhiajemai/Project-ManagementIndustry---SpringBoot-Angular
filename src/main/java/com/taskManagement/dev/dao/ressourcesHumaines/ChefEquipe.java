package com.taskManagement.dev.dao.ressourcesHumaines;

import javax.persistence.DiscriminatorValue;


@DiscriminatorValue("ChefEquipe")
public class ChefEquipe extends Employee {
	
	private int nbreProjetOilGaz;
	private int nbreProjetTurbines;
	private int nbreProjetTot;

}
