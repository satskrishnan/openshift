package com.infosys.creams.usermaintenance.gateway;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;

import com.infosys.creams.usermaintenance.model.Role;

public interface UserMaintenanceGateway {

	@GetMapping("/allRoles")
	public List<Role> getAllRoles();
}
