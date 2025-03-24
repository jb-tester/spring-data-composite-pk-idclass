package com.mytests.spring.springdatacompositepkidclass.services;

import com.mytests.spring.springdatacompositepkidclass.model.Employee;
import com.mytests.spring.springdatacompositepkidclass.model.EmployeeId;
import com.mytests.spring.springdatacompositepkidclass.repositories.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public List<Employee> collectAllEmployees(){
        return employeeRepository.findAllEmployees();
    }

    public Optional<Employee> findByHardcodedId() {
        return employeeRepository.findById(new EmployeeId("John","RnD","QA"));
    }

    public String findEmployeeById(String name, String dep, String position){
        Optional<Employee> emp = employeeRepository.findById(new EmployeeId(name, dep, position));
        return emp.isPresent() ? emp.get().toString() : "Employee not found";
    }

    public String findEmployeesByIds() {
        List<Employee> emps = (List<Employee>) employeeRepository.findAllById(List.of(new EmployeeId("John","RnD","QA"), new EmployeeId("Paul","RnD","Developer")));
        return emps.toString();
    }
}
