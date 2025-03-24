package com.mytests.spring.springdatacompositepkidclass.repositories;

import com.mytests.spring.springdatacompositepkidclass.model.Department;
import com.mytests.spring.springdatacompositepkidclass.model.DepartmentId;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;


public interface DepartmentRepository extends CrudRepository<Department, DepartmentId> {
    Department findByNameAndLocation(String name,String location);

    @Override
    Optional<Department> findById(DepartmentId departmentId);

    @Override
    Iterable<Department> findAllById(Iterable<DepartmentId> departmentIds);
}
