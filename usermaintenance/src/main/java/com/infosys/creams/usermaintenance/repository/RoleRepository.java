package com.infosys.creams.usermaintenance.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infosys.creams.usermaintenance.model.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {

}
