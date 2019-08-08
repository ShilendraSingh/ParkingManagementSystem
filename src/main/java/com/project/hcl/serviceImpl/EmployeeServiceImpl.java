package com.project.hcl.serviceImpl;

import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.hcl.entity.EmployeeEntity;
import com.project.hcl.repository.EmployeeRepo;
import com.project.hcl.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepo employeeRepo;

	@Override
	public List<?> getSeniorLeve() {

		List<EmployeeEntity> employee = employeeRepo.findAll();

		List<String> collect = employee.stream()
				.filter(emp -> emp.getEmployeeExperience() > 15 || isDesignationSenior(emp.getEmployeeDes()))
				.map(e -> e.getEmployeeName()).collect(Collectors.toList());

		return collect;
	}

	private boolean isDesignationSenior(String employeeDes) {
		desiganation[] values = desiganation.values();
		for (desiganation val : values) {
			if (val.toString().equals(employeeDes))
			{
				return true;
			}
		}
		return false;
	}

	enum desiganation {
		VICEPRESIDENT, PRESEDENT, CTO, CFO;

	}

}
