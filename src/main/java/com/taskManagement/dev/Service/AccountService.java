package com.taskManagement.dev.Service;

import com.taskManagement.dev.dao.ressourcesHumaines.Employee;
import com.taskManagement.dev.dao.ressourcesHumaines.Roles;

public interface AccountService {
	
	public Employee saveEmployee(Employee employee);
	public Roles saveRoles(Roles roles);
	public void addRolesToEmployee(String userName, String roleName);
	public Employee findByUsername(String username);

}
