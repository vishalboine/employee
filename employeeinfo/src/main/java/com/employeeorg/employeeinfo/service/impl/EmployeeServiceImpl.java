package com.employeeorg.employeeinfo.service.impl;

import java.util.List;

import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.employeeorg.employeeaddress.AddressServiceGrpc;
import com.employeeorg.employeeaddress.GetEmployeeAddressRequest;
import com.employeeorg.employeeaddress.GetEmployeeAddressResponse;
import com.employeeorg.employeeinfo.entity.Employee;
import com.employeeorg.employeeinfo.jackson.JacksonUtil;
import com.employeeorg.employeeinfo.repository.EmployeeRepository;
import com.employeeorg.employeeinfo.service.EmployeeService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;


@Component
public class EmployeeServiceImpl implements EmployeeService {
	
    @GrpcClient("employee-address")
    private AddressServiceGrpc.AddressServiceBlockingStub addressClient;


    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<Employee> getEmployeeById(int empId) {
    	System.out.println(getEmployeeAddress(empId));
        return employeeRepository.findByEmpId(empId);
    }

    @Override
    public List<Employee> getEmployeeByName(String empName) {
        return employeeRepository.findByEmpName(empName);
    }

    @Override
    public List<Employee> getEmployeeByDesignation(String designation) {
        return employeeRepository.findByEmpDesgination(designation);
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public JsonNode getEmployee(Integer id, String name, String designation, JsonNode returnNode) {
        if (id != null) {
            returnNode = JacksonUtil.mapper.valueToTree(getEmployeeById(id));
        }
        if (!name.equals("") && name != null) {
            returnNode = JacksonUtil.mapper.valueToTree(getEmployeeByName(name));
        }
        if (!designation.equals("") && designation != null) {
            returnNode = JacksonUtil.mapper.valueToTree(getEmployeeByDesignation(designation));
        }
        if (id == null && (name.equals("") || name == null) && (designation.equals("") || designation == null)) {
            returnNode = JacksonUtil.mapper.valueToTree(getAllEmployees());
        }
        return returnNode;
    }

    @Override
    public void postEmployee(Integer empId, String empName, String designation) {
        employeeRepository.save(new Employee(empId, empName, designation));
    }

    @Override
    public ObjectNode postEmployee(String msgData, ObjectNode returnNode) {
        JsonNode msgObj;
        try {
            msgObj = JacksonUtil.mapper.readTree(msgData);
            int empId = msgObj.get("empId").asInt();
            String empName = msgObj.get("empName").asText();
            String designation = msgObj.get("designation").asText();
            postEmployee(empId, empName, designation);
            returnNode.put("message", "Record Saved Successfully!");
        } catch (JsonProcessingException e) {
            System.out.println(e);
        }
        return returnNode;
    }

    @Override
    public ObjectNode putEmployee(String msgData, ObjectNode returnNode) {
        JsonNode msgObj;
        try {
            msgObj = JacksonUtil.mapper.readTree(msgData);
            int empId = 0;
            if(msgObj.get("empId") != null)
                empId = msgObj.get("empId").asInt();
            String empName="";
            if(msgObj.get("empName") != null)
                empName = msgObj.get("empName").asText();
            String designation="";
            if(msgObj.get("designation")!=null)
                designation = msgObj.get("designation").asText();
            List<Employee> employees = employeeRepository.findByEmpId(empId);
            Employee employee = employees.get(0);
            if (!empName.equals(""))
                employee.setEmpName(empName);
            if (!designation.equals(""))
                employee.setEmpDesgination(designation);
            employeeRepository.save(employee);
            returnNode = JacksonUtil.mapper.valueToTree(employee);
        } catch (JsonProcessingException e) {
            System.out.println(e);
        }
        return returnNode;
    }

    @Override
    @Transactional
    public ObjectNode deleteEmployee(Integer id, String name, String designation, ObjectNode returnNode) {
        if (id != null) {
            employeeRepository.deleteByEmpId(id);
        }
        if (!name.equals("") && name != null) {
            employeeRepository.deleteByEmpName(name);
        }
        if (!designation.equals("") && designation != null) {
            employeeRepository.deleteByEmpDesgination(designation);
        }
        if (id == null && (name.equals("") || name == null) && (designation.equals("") || designation == null)) {
            employeeRepository.deleteAll();
        }
        returnNode.put("message", "Record Deleted Succesfully");
        return returnNode;
    }
    
    public GetEmployeeAddressResponse getEmployeeAddress(int empId) {
    	var request = GetEmployeeAddressRequest.newBuilder().setEmpId(empId).build();
    	return addressClient.getEmployeeAddress(request);
    }

}
