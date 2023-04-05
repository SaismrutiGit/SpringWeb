package com.student.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.student.entity.Employeee;

public interface EmployeeeRepository extends JpaRepository<Employeee, Integer> {

}
