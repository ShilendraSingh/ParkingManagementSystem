package com.project.hcl.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
public class EmployeeEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long employeeId;
	private String employeeName;
	private int employeeExperience;
	private String employeeDes;

	

	/*
	 * public EmployeeEntity(Long employeeId, String employeeName, int
	 * employeeExperience, String employeeDes) { this.employeeId = employeeId;
	 * this.employeeName = employeeName; this.employeeExperience =
	 * employeeExperience; this.employeeDes = employeeDes; }
	 */

	public Long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public int getEmployeeExperience() {
		return employeeExperience;
	}

	public void setEmployeeExperience(int employeeExperience) {
		this.employeeExperience = employeeExperience;
	}

	public String getEmployeeDes() {
		return employeeDes;
	}

	public void setEmployeeDes(String employeeDes) {
		this.employeeDes = employeeDes;
	}

}
