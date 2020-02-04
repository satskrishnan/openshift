package com.infosys.creams.usermaintenance.gateway;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infosys.creams.usermaintenance.model.Role;
import com.infosys.creams.usermaintenance.service.UserMaintenanceFacadeService;

import io.opentracing.Tracer;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@Tag(name = "UserMaintenance", description = "UserMaintenance Service")
@RequestMapping("/usermaintenance")
public class UserMaintenanceGatewayImpl implements UserMaintenanceGateway {
	private static final Logger logger = LoggerFactory.getLogger(UserMaintenanceGatewayImpl.class);

	private UserMaintenanceFacadeService userMaintenanceFacadeService;

	private Tracer tracer;

	UserMaintenanceGatewayImpl(UserMaintenanceFacadeService userMaintenanceFacadeService, Tracer tracer) {
		this.userMaintenanceFacadeService = userMaintenanceFacadeService;
		this.tracer = tracer;
	}

	@Operation(summary = "Fetch User Roles", tags = { "UserMaintenance" })
	@ApiResponses(value = { @ApiResponse(responseCode = "200", description = "successful operation") })
	@GetMapping("/allRoles")
	public List<Role> getAllRoles() {
		logger.info("Fetching all roles");
		tracer.buildSpan("Fetching all roles");
		return this.userMaintenanceFacadeService.getAllRoles();
	}

}
