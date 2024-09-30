package com.employeeorg.employeeinfo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.employeeorg.employeeinfo.entity.Employee;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

    List<Employee> findByEmpId(int empId);

    List<Employee> findByEmpName(String empName);

    List<Employee> findByEmpDesgination(String empDesgination);

    void deleteByEmpId(int empId);
    
    void deleteByEmpName(String empName);

    void deleteByEmpDesgination(String empDesignation);

}
