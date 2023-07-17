package com.academy.goals.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.academy.goals.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
