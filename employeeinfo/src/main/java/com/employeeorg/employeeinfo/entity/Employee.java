package com.employeeorg.employeeinfo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name = "employee_info")
public class Employee {
    @Id
    private int empId;

    private String empName;

    @Column(name = "designation")
    private String empDesgination;

    

    public Employee() {
    }

    public Employee(int empId, String empName, String empDesgination) {
        this.empId = empId;
        this.empName = empName;
        this.empDesgination = empDesgination;
    }

    public int getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    public String getEmpDesgination() {
        return empDesgination;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public void setEmpDesgination(String empDesgination) {
        this.empDesgination = empDesgination;
    }

    @Override
    public String toString() {
        return "Employee [empId=" + empId + ", empName=" + empName + ", empDesgination=" + empDesgination + "]";
    }

}
