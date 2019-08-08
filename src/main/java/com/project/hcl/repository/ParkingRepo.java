package com.project.hcl.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.hcl.entity.ParkingEntity;

@Repository
public interface ParkingRepo extends JpaRepository<ParkingEntity, Long> {

}
