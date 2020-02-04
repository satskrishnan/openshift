package com.infosys.creams.usermaintenance.service;

import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.infosys.creams.usermaintenance.model.Role;
import com.infosys.creams.usermaintenance.repository.RoleRepository;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class UserMaintenanceFacadeService {

	static final Logger logger = LoggerFactory.getLogger(UserMaintenanceFacadeService.class);

	private RoleRepository roleRepository;

	UserMaintenanceFacadeService(RoleRepository roleRepository) {
		this.roleRepository = roleRepository;
	}

	@HystrixCommand(fallbackMethod = "getRolesFallback")
	public List<Role> getAllRoles() {
		logger.info("Fetching all roles");
		return this.roleRepository.findAll();
	}

	public List<Role> getRolesFallback() {
		return Arrays.asList();
	}
}
