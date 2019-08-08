package com.project.hcl.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ParkingEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long parkingId;
	private Long EmployeeId;
	private String reserved;
	private String status;
	
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Long getParkingId() {
		return parkingId;
	}
	public void setParkingId(Long parkingId) {
		this.parkingId = parkingId;
	}
	public Long getEmployeeId() {
		return EmployeeId;
	}
	public void setEmployeeId(Long employeeId) {
		EmployeeId = employeeId;
	}
	public String getReserved() {
		return reserved;
	}
	public void setReserved(String reserved) {
		this.reserved = reserved;
	}
	
	
	
	
	
	
	
}
