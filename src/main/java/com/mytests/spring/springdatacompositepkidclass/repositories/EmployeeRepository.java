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

    // https://youtrack.jetbrains.com/issue/IDEA-369016/Spring-JPA-findById-repository-method-is-shown-as-error-in-case-of-IdClass
    Optional<Employee> findById(EmployeeId id);

    // https://youtrack.jetbrains.com/issue/IDEA-369676/Spring-JPA-false-error-is-shown-for-findAllByIdIterableID-method-parameter-in-case-of-IdClass
    Iterable<Employee> findAllById(Iterable<EmployeeId> ids);
}
