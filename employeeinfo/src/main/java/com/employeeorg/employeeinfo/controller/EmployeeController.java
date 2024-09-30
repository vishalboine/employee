package com.employeeorg.employeeinfo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.employeeorg.employeeinfo.jackson.JacksonUtil;
import com.employeeorg.employeeinfo.response.ApiHttpResponse;
import com.employeeorg.employeeinfo.service.EmployeeService;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

@RestController
public class EmployeeController {


   private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping(value = "/employee", produces = "application/json")
    public ResponseEntity<ApiHttpResponse> getEmployee(@RequestParam(name = "empId", required = false) Integer id,
            @RequestParam(name = "empName", defaultValue = "", required = false) String name,
            @RequestParam(name = "empDesignation", defaultValue = "", required = false) String designation) {

        JsonNode returnNode = JacksonUtil.mapper.createArrayNode();
        try {
            returnNode = employeeService.getEmployee(id, name, designation, returnNode);
            return new ResponseEntity<>(new ApiHttpResponse(true, 200, returnNode), HttpStatus.OK);
        } catch (Exception e) {
            System.out.println(e);
            return new ResponseEntity<>(new ApiHttpResponse(false, 0, returnNode), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping(value = "/employee", produces= "application/json")
    public ResponseEntity<ApiHttpResponse> postEmployee(@RequestBody String msgData){
        ObjectNode returnNode = JacksonUtil.mapper.createObjectNode();
        try {
            returnNode = employeeService.postEmployee(msgData, returnNode);
            return new ResponseEntity<>(new ApiHttpResponse(true, 200, returnNode), HttpStatus.OK);
        } catch (Exception e) {
            System.out.println(e);
            return new ResponseEntity<>(new ApiHttpResponse(false, 0, returnNode), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping(value = "/employee", produces= "application/json")
    public ResponseEntity<ApiHttpResponse> putEmployee(@RequestBody String msgData){
        ObjectNode returnNode = JacksonUtil.mapper.createObjectNode();
        try {
            returnNode = employeeService.putEmployee(msgData, returnNode);
            return new ResponseEntity<>(new ApiHttpResponse(true, 200, returnNode), HttpStatus.OK);
        } catch (Exception e) {
            System.out.println(e);
            return new ResponseEntity<>(new ApiHttpResponse(false, 0, returnNode), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @DeleteMapping(value = "/employee", produces= "application/json")
    public ResponseEntity<ApiHttpResponse> deleteEmployee(@RequestParam(name = "empId", required = false) Integer id,
    @RequestParam(name = "empName", defaultValue = "", required = false) String name,
    @RequestParam(name = "empDesignation", defaultValue = "", required = false) String designation){
        ObjectNode returnNode = JacksonUtil.mapper.createObjectNode();
        try {
            returnNode = employeeService.deleteEmployee(id, name, designation, returnNode);
            return new ResponseEntity<>(new ApiHttpResponse(true, 200, returnNode), HttpStatus.OK);
        } catch (Exception e) {
            System.out.println(e);
            return new ResponseEntity<>(new ApiHttpResponse(false, 0, returnNode), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


}
