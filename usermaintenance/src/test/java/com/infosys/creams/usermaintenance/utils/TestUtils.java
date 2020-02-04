package com.infosys.creams.usermaintenance.utils;

import java.util.ArrayList;
import java.util.List;

import com.infosys.creams.usermaintenance.model.Role;

public class TestUtils {

	public static List<Role> getAllRoles() {
		List<Role> roles = new ArrayList<>();
		Role role = new Role();
		role.setRoleId(1);
		role.setRoleName("Admin");
		roles.add(role);
		
		role = new Role();
		role.setRoleId(2);
		role.setRoleName("Rig Manager");
		roles.add(role);
		return roles;
	}
}
