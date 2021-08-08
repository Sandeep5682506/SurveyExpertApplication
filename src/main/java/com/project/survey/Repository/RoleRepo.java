package com.project.survey.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.survey.Model.Role;

@Repository("roleRepository")
public interface RoleRepo extends JpaRepository<Role, Integer> {
	 Role findByRole(String role);

}
