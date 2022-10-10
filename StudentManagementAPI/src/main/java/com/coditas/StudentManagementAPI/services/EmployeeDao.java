package com.coditas.StudentManagementAPI.services;

import com.coditas.StudentManagementAPI.entities.Employee;

import java.util.List;

public interface EmployeeDao {

    void createEmployeeRecord(Employee employee);

    void    deleteEmployeeRecord(int employeeId);

    public List<Employee> fetchAllEmployee();

    void updateEmployeeDetails(Employee employee);

    public Employee fetchbyId(int id);

}
