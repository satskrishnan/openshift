package com.infosys.creams.usermaintenance.gateway;

import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.infosys.creams.usermaintenance.model.Role;
import com.infosys.creams.usermaintenance.service.UserMaintenanceFacadeService;
import com.infosys.creams.usermaintenance.utils.TestUtils;

import io.opentracing.Tracer;

@RunWith(MockitoJUnitRunner.class)
public class UserMaintenanceGatewayImplTest {
	@Mock
	private UserMaintenanceFacadeService userMaintenanceFacadeService;

	@Mock
	UserMaintenanceGatewayImpl userMaintenanceGatewayImpl;

	@Mock
	Tracer tracer;

	@Before
	public void init() {
		userMaintenanceGatewayImpl = new UserMaintenanceGatewayImpl(userMaintenanceFacadeService, tracer);
	}

	@Test
	public void testGetAllRoles() {
		List<Role> roles = TestUtils.getAllRoles();
		when(userMaintenanceFacadeService.getAllRoles()).thenReturn(roles);
		Assert.assertEquals(userMaintenanceGatewayImpl.getAllRoles().size(), 2);
	}
}
