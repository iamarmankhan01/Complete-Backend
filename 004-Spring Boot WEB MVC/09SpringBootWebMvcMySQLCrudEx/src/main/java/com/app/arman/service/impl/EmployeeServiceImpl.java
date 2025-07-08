package com.app.arman.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.app.arman.entity.Employee;
import com.app.arman.repo.EmployeeRepository;
import com.app.arman.service.IEmployeeService;

@Service
public class EmployeeServiceImpl implements IEmployeeService {

    @Autowired
    private EmployeeRepository employeeRepo;

    @Override
    public Integer saveEmployee(Employee e) {
        return employeeRepo.save(e).getEmpId();
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepo.findAll();
    }

    @Override
    public void deleteEmployee(Integer id) {
        employeeRepo.deleteById(id);
    }

    @Override
    public Employee getOneEmployee(Integer id) {
        return employeeRepo.findById(id).orElse(null);
    }

    @Override
    public void updateEmployee(Employee e) {
        employeeRepo.save(e);
    }

    @Override
    public Page<Employee> getAllEmployees(Pageable pageable) {
        return employeeRepo.findAll(pageable);
    }
}
