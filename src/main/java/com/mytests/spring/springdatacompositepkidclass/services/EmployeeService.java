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

    public List<Employee> getAllEmployees(){
        return employeeRepository.findAllEmployees();
    }

    public Optional<Employee> findById() {
        return employeeRepository.findById(new EmployeeId("John","RnD","QA"));
    }
}
