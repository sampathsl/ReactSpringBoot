package com.sampathsl.react.springboot.reactspringboot.repository;

import com.sampathsl.react.springboot.reactspringboot.entity.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, Long> { }
