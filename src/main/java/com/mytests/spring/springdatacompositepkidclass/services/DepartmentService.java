package com.mytests.spring.springdatacompositepkidclass.services;

import com.mytests.spring.springdatacompositepkidclass.model.Department;
import com.mytests.spring.springdatacompositepkidclass.repositories.DepartmentRepository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class DepartmentService {

    private final DepartmentRepository departmentRepository;

    public DepartmentService(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    public List<Department> findAllDepartments(){
        List<Department> all = (List<Department>) departmentRepository.findAll();
        return all;
    }
}
