package com.student.service;

import java.util.List;

import com.student.entity.Employeee;

public interface IEmployeeeService {
	
	public void deleteEmp(Integer id);
	public void updateEmp(Employeee emp);
	public boolean isExist(Integer id);
	
	public List<Employeee> getAllEmployee();
	public Integer saveEmplyeee(Employeee emp);
	public Employeee getOneEmployeee(Integer id);
	

}
