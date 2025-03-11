package com.mytests.spring.springdatacompositepkidclass.repositories;

import com.mytests.spring.springdatacompositepkidclass.model.Department;
import com.mytests.spring.springdatacompositepkidclass.model.DepartmentId;
import org.springframework.data.repository.CrudRepository;

/**
 * *
 * <p>Created by irina on 3/7/2025.</p>
 * *
 */
public interface DepartmentRepository extends CrudRepository<Department, DepartmentId> {
    Department findByNameAndLocation(String name,String location);
}
