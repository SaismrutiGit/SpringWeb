package com.student.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@RequiredArgsConstructor
@AllArgsConstructor
public class Employeee {
    @Id
    @GeneratedValue
	private Integer empId;
    @NonNull
	private String empName;
    @NonNull
	private Double empFee;
    @NonNull
	private String empCourse;
}
