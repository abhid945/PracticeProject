package com.coditas.StudentManagementAPI.controller;

import com.coditas.StudentManagementAPI.entities.Employee;
import com.coditas.StudentManagementAPI.services.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class EmployeeController {

    @Autowired
    EmployeeDao employeeDao;

    @RequestMapping(value = "/register",method =  RequestMethod.POST,consumes = "application/JSON")
     public void createEmployeeRecord(@RequestBody Employee employee){
        //System.out.println(employee);
        employeeDao.createEmployeeRecord(employee);
    }

    @GetMapping("/employees")
     List<Employee> fetchAllEmployee(){

        return employeeDao.fetchAllEmployee();
    }

    @GetMapping("/employee/{employeeId}")
    Employee getEmployee(@PathVariable int employeeId){
      return  employeeDao.fetchbyId(employeeId);
    }

    @PutMapping("/update")
    void updateEmployeeDetails(@RequestBody  Employee employee)
    {
        employeeDao.updateEmployeeDetails(employee);

    }

    @DeleteMapping("/delete/{employeeId}")
     void deleteEmployeeRecord(@PathVariable  int employeeId)
    {
        employeeDao.deleteEmployeeRecord(employeeId);

    }

}
