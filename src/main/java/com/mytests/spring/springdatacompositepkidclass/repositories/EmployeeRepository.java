package com.mytests.spring.springdatacompositepkidclass.repositories;

import com.mytests.spring.springdatacompositepkidclass.model.Employee;
import com.mytests.spring.springdatacompositepkidclass.model.EmployeeId;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface EmployeeRepository extends Repository<Employee, EmployeeId>{
    Employee findByNameAndDepartmentNameAndDepartmentLocation(String name, String dep, String location);

    @Query("SELECT e FROM Employee e")
    List<Employee> findAllEmployees();

    Optional<Employee> findById(EmployeeId id);

    List<Employee> findAllById(Iterable<EmployeeId> ids);
}
