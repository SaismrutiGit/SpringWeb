package com.student.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.entity.Employeee;
import com.student.repository.EmployeeeRepository;
import com.student.service.IEmployeeeService;

@Service
public class EmployeeeServiceImpl implements IEmployeeeService{
     @Autowired
	private EmployeeeRepository e;
	
	@Override
	public void deleteEmp(Integer id) {
		// TODO Auto-generated method stub
		e.deleteById(id);
	}

	@Override
	public void updateEmp(Employeee emp) {
		// TODO Auto-generated method stub
	  e.save(emp);	
	}

	@Override
	public List<Employeee> getAllEmployee() {
		// TODO Auto-generated method stub
		return e.findAll();
	}

	@Override
	public Integer saveEmplyeee(Employeee emp) {
		// TODO Auto-generated method stub
		return	e.save(emp).getEmpId();
		
	}

	@Override
	public Employeee getOneEmployeee(Integer id) {
		// TODO Auto-generated method stub
		Optional<Employeee> opt=e.findById(id);
		if(opt.isPresent()) {
		return opt.get();	
		}
		return null;
	}

	@Override
	public boolean isExist(Integer id) {
		// TODO Auto-generated method stub
		return e.existsById(id);
	}

}
