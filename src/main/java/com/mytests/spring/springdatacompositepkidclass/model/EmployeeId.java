package com.mytests.spring.springdatacompositepkidclass.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class EmployeeId implements Serializable {

        private String name;
        private String departmentName;
        private String designation;
    

}
