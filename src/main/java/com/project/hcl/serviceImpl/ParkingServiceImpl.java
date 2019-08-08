package com.project.hcl.serviceImpl;

import java.util.Optional;

import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.stereotype.Service;

import com.project.hcl.entity.EmployeeEntity;
import com.project.hcl.entity.ParkingEntity;
import com.project.hcl.repository.ParkingRepo;
import com.project.hcl.service.ParkingService;

@Service
public class ParkingServiceImpl implements ParkingService{

	@AutoConfigureOrder
	private ParkingRepo parkingRepo;
	
	@Override
	public ParkingEntity releaseParking(Long parkingId) {
		
		ParkingEntity parkingEntity = new ParkingEntity ();
		Optional<ParkingEntity> bookedSpot=parkingRepo.findById(parkingId);
		if(bookedSpot.isPresent())
		{
			parkingEntity=bookedSpot.get();
		
			parkingEntity.setReserved("Available");
			parkingRepo.save(parkingEntity);
			
		}

		
		return parkingEntity;
	}

	@Override
	public ParkingEntity book(EmployeeEntity empParking, Long parkingId) {
		ParkingEntity parkingSpotStore=new ParkingEntity();
		Optional<ParkingEntity> parkingSpotRepo=parkingRepo.findById(parkingId);
		if(parkingSpotRepo.isPresent())
		{
			
			parkingSpotStore=parkingSpotRepo.get();
			if(parkingSpotStore.getStatus().equalsIgnoreCase("AVAILABLE"));
			{
				parkingSpotStore.setEmployeeId(empParking.getEmployeeId());
				parkingSpotStore.setStatus("BOOKED");
				parkingRepo.save(parkingSpotStore);
			}
		}
		return parkingSpotStore;
	}
	
		 
	}


