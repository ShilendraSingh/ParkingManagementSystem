package com.project.hcl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.hcl.entity.EmployeeEntity;
import com.project.hcl.entity.ParkingEntity;
import com.project.hcl.service.ParkingService;

@RestController
@RequestMapping("/parking")
public class ParkingController {
	
	@Autowired
	private ParkingService parkingService;
	
	@PutMapping("/release/{spotId}")
	public ParkingEntity releasespoy(@PathVariable Long parkingId) {
		
		return parkingService.releaseParking(parkingId);
	}

	@PutMapping("/book/{spotId}")
	   public ParkingEntity bookSpot(@RequestBody EmployeeEntity empParking,@PathVariable Long spotId)
	   {
		  
		   return  parkingService.book(empParking, spotId);
	   }
	}
