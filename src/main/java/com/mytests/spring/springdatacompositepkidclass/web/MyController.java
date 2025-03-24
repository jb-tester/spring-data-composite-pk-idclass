package com.mytests.spring.springdatacompositepkidclass.web;

import com.mytests.spring.springdatacompositepkidclass.model.Department;
import com.mytests.spring.springdatacompositepkidclass.model.Employee;
import com.mytests.spring.springdatacompositepkidclass.services.DepartmentService;
import com.mytests.spring.springdatacompositepkidclass.services.EmployeeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class MyController {


    private final DepartmentService departmentService;
    private final EmployeeService employeeService;

    MyController(DepartmentService departmentService, EmployeeService employeeService) {
        this.departmentService = departmentService;
        this.employeeService = employeeService;
    }

    @GetMapping("/allDepartments")
    public ResponseEntity<List<Department>> findAllDepartments() {
        return ResponseEntity.ok(departmentService.findAllDepartments());
    }

    @GetMapping("/allEmployees")
    public ResponseEntity<List<Employee>> findAllEmployees() {
        return ResponseEntity.ok(employeeService.collectAllEmployees());
    }

    @GetMapping("/employee")
    public ResponseEntity<String> findEmployeeById() {
        return ResponseEntity.ok(employeeService.findByHardcodedId().toString());
    }
    @GetMapping("/employee/{name}-{dep}-{designation}")
    public ResponseEntity<String> findEmployeeById2(@PathVariable String name, @PathVariable String dep, @PathVariable String designation) {
        return ResponseEntity.ok(employeeService.findEmployeeById(name,dep,designation));
    }
    @GetMapping("/employees")
    public ResponseEntity<String> findEmployeeById3() {
        return ResponseEntity.ok(employeeService.findEmployeesByIds());
    }
}
