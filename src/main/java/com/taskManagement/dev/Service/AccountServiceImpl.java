package com.taskManagement.dev.Service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.taskManagement.dev.dao.ressourcesHumaines.Employee;
import com.taskManagement.dev.dao.ressourcesHumaines.Roles;

@Service
@Transactional
public class AccountServiceImpl implements AccountService {
	
	@Autowired
	private BCryptPasswordEncoder bcryptPasswordEncoder;

	@Override
	public Employee saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Roles saveRoles(Roles roles) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addRolesToEmployee(String userName, String roleName) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Employee findByUsername(String username) {
		// TODO Auto-generated method stub
		return null;
	}

}
