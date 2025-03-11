package com.mytests.spring.springdatacompositepkidclass.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;

@Entity
@Table(name = "Employee")
@IdClass(EmployeeId.class)
public class Employee {

    @Id
    @Column(name = "Name")
    private String name;
    @Id
    @Column(name = "Department")
    private String departmentName;
    @Id
    @Column(name = "Designation")
    private String designation;

    @Column(name = "Location")
    private String departmentLocation;
    @ManyToOne
    @JoinColumns({
            @JoinColumn(name="Department", referencedColumnName="Name",insertable = false,updatable = false),
            @JoinColumn(name="Location", referencedColumnName="Location",insertable = false,updatable = false),
    })
    @JsonIgnore
    private Department department;
    @Column(name = "Salary")
    private Double salary;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getDepartmentLocation() {
        return departmentLocation;
    }

    public void setDepartmentLocation(String departmentLocation) {
        this.departmentLocation = departmentLocation;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
               "name='" + name + '\'' +
               ", departmentName='" + departmentName + '\'' +
               ", designation='" + designation + '\'' +
               ", departmentLocation='" + departmentLocation + '\'' +
               ", department=" + department +
               ", salary=" + salary +
               '}';
    }
}
