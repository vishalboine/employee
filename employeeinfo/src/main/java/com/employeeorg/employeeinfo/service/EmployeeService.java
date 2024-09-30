package com.employeeorg.employeeinfo.service;

import java.util.List;

import com.employeeorg.employeeinfo.entity.Employee;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

public interface EmployeeService {
    List<Employee> getEmployeeById(int empId);
    List<Employee> getEmployeeByName(String empName);
    List<Employee> getEmployeeByDesignation(String designation);
    List<Employee> getAllEmployees();
    JsonNode getEmployee(Integer empId, String empName, String designation, JsonNode returNode);

    void postEmployee(Integer empId, String empName, String designation);
    ObjectNode postEmployee(String msgData, ObjectNode returnNode);

    ObjectNode putEmployee(String msgData, ObjectNode returnNode);
    ObjectNode deleteEmployee(Integer id, String name, String designation, ObjectNode returnNode);
}
