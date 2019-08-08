package com.project.hcl.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.project.hcl.entity.EmployeeEntity;
import com.project.hcl.entity.ParkingEntity;

@Service
public interface ParkingService {
	
	
	public ParkingEntity releaseParking(Long parkingId);
	
	public ParkingEntity book(EmployeeEntity empParking, Long spotId);
	

}
