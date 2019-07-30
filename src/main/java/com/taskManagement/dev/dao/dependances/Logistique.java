package com.taskManagement.dev.dao.dependances;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

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
public class Logistique implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long idLog;
	private String libelleLog;
	private String listePiece;
	private double coutLog;

	@ManyToOne
	@JoinColumn(name = "id_Projet")
	private Projet projet;

	@OneToMany(mappedBy = "logistique", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private Set<Piece> pieces;

}
