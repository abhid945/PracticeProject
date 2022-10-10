package com.coditas.StudentManagementAPI.entities;

import org.hibernate.annotations.GeneratorType;

import javax.persistence.*;
import java.util.List;


@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int employeeId;
    public String employeeName;
    public int employeeAge;
    public String domain;

//    @ManyToMany
//    private List<Address> Address;
    public float weeklyRating;
   public float interviewRating;

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", employeeName='" + employeeName + '\'' +
                ", employeeAge=" + employeeAge +
                ", domain='" + domain + '\'' +
                ", weeklyRating=" + weeklyRating +
                ", interviewRating=" + interviewRating +
                '}';
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getEmployeeAge() {
        return employeeAge;
    }

    public void setEmployeeAge(int employeeAge) {
        this.employeeAge = employeeAge;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public float getWeeklyRating() {
        return weeklyRating;
    }

    public void setWeeklyRating(float weeklyRating) {
        this.weeklyRating = weeklyRating;
    }

    public float getInterviewRating() {
        return interviewRating;
    }

    public void setInterviewRating(float interviewRating) {
        this.interviewRating = interviewRating;
    }

    public Employee(int employeeId, String employeeName, int employeeAge, String domain, float weeklyRating, float interviewRating) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeAge = employeeAge;
        this.domain = domain;
        this.weeklyRating = weeklyRating;
        this.interviewRating = interviewRating;
    }

    public Employee(String employeeName, int employeeAge, String domain, float weeklyRating, float interviewRating) {
        this.employeeName = employeeName;
        this.employeeAge = employeeAge;
        this.domain = domain;
        this.weeklyRating = weeklyRating;
        this.interviewRating = interviewRating;
    }

    public Employee() {
    }
}
