package com.taskManagement.dev.dao.dependances;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.springframework.stereotype.Component;

import com.taskManagement.dev.dao.Projet;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Component
@Entity
@Data @NoArgsConstructor @AllArgsConstructor @ToString
public class Piece implements Serializable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long idPiece;
	private String libellePiece;
	private double coutPiece;
	private String descPiece;
	
	@ManyToOne
	@JoinColumn(name = "id_Logistique")
	private Logistique logistique;

}
