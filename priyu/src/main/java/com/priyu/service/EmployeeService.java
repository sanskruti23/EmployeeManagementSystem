package com.priyu.service;

import com.priyu.entity.Employee;
import com.priyu.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;
    public boolean updateEmployee(Long employeeId,Employee updatedEmployee){
        try{
            Employee Employeedb=employeeRepository.findById(employeeId).get();
            Employeedb.setName(updatedEmployee.getName());
            Employeedb.setEmail(updatedEmployee.getEmail());
            Employeedb.setAddress(updatedEmployee.getAddress());
            employeeRepository.save(Employeedb);
        }catch (Exception e){
            return false;
        }
        return true;}

    public  boolean deleteEmployeeById(Long employeeId){
        try{
            Employee Employeedb=employeeRepository.findById(employeeId).get();
            employeeRepository.delete(Employeedb);
        }catch (Exception e){
            return false;
        }
        return true;}
    }



