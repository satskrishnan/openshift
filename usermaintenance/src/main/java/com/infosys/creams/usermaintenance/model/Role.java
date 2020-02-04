package com.infosys.creams.usermaintenance.model;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * The persistent class for the role database table.
 * 
 */
@Entity
@Getter
@Setter
public class Role {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "role_id")
	private Integer roleId;

	@Column(name = "role_inactive", nullable = false)
	private Integer roleInactive;

	@Temporal(TemporalType.DATE)
	@Column(name = "role_inactive_date")
	private Date roleInactiveDate;

	@Column(name = "role_name", nullable = false)
	private String roleName;

	@Column(name = "tenant_id")
	private Integer tenantId;

	public Integer getRoleId() {
		return roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	public Integer getRoleInactive() {
		return roleInactive;
	}

	public void setRoleInactive(Integer roleInactive) {
		this.roleInactive = roleInactive;
	}

	public Date getRoleInactiveDate() {
		return roleInactiveDate;
	}

	public void setRoleInactiveDate(Date roleInactiveDate) {
		this.roleInactiveDate = roleInactiveDate;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public Integer getTenantId() {
		return tenantId;
	}

	public void setTenantId(Integer tenantId) {
		this.tenantId = tenantId;
	}

}