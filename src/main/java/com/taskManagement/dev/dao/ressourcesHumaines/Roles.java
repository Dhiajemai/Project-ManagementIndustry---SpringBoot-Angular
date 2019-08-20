package com.taskManagement.dev.dao.ressourcesHumaines;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Component
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Roles {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long idrole;
	private String roleName;

}
