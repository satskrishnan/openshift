package com.infosys.creams.usermaintenance.service;

import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.infosys.creams.usermaintenance.model.Role;
import com.infosys.creams.usermaintenance.repository.RoleRepository;
import com.infosys.creams.usermaintenance.utils.TestUtils;

@RunWith(SpringRunner.class)
@DataJpaTest
public class UserMaintenanceFacadeServiceTest {
	@Mock
	RoleRepository roleRepository;
	@Mock
	UserMaintenanceFacadeService userMaintenanceFacadeService;

	@Before
	public void init() {
		userMaintenanceFacadeService = new UserMaintenanceFacadeService(roleRepository);
	}

	@Test
	public void testGetAllRoles() {
		List<Role> roles = TestUtils.getAllRoles();
		when(roleRepository.findAll()).thenReturn(roles);
		Assert.assertEquals(userMaintenanceFacadeService.getAllRoles().size(), 2);
	}

}
