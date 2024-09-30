package com.employeeorg.employeeaddress.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.employeeorg.employeeaddress.entity.EmployeeAddress;

@Repository
public interface EmployeeAddressRepository extends JpaRepository<EmployeeAddress, Integer>{
	public EmployeeAddress findEmployeeAddressByEmpId(int empId);
}
