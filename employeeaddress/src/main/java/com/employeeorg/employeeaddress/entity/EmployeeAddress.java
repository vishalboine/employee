package com.employeeorg.employeeaddress.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "employee_address")
public class EmployeeAddress {
	
	@Id
	@Column(name = "emp_id")
	private int empId;
	@Column(name = "emp_address")
	private String empAddress;
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	
	public String getEmpAddress() {
		return empAddress;
	}
	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}
	@Override
	public String toString() {
		return "EmployeeAddress [empId=" + empId + ", empAddress=" + empAddress + "]";
	}
	
}
