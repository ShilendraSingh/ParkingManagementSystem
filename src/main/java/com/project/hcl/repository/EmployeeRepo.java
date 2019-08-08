package com.project.hcl.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.hcl.entity.EmployeeEntity;

@Repository
public interface EmployeeRepo extends JpaRepository<EmployeeEntity, Long> {
	
	
	/*
	 * EmployeeEntity findbyemployeeExperience (int employeeExperience );
	 * EmployeeEntity findbyemployeeDes( String employeeDes);
	 */
	

	
}
