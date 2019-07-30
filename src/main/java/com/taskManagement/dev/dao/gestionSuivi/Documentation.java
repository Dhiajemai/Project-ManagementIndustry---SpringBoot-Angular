package com.taskManagement.dev.dao.gestionSuivi;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Component
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Documentation implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long idDocument;
	private String nomDocument;
	private String descDocument;
	private String typeDocument;
	private String cheminDocument;

	/***** RELATION AVEC LA TABLE SOUS-ETAPE *****/
	@ManyToOne
	@JoinColumn(name = "sous_etape")
	private SousEtape sousEtape;

}
