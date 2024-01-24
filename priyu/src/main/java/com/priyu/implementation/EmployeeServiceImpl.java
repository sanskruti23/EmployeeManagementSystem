//package com.priyu.implementation;
//
//import com.priyu.entity.Employee;
//import com.priyu.repository.EmployeeRepository;
//import com.priyu.service.EmployeeService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public class EmployeeServiceImpl extends EmployeeService {
//
//    @Autowired
//    private EmployeeRepository employeeRepository;
//
//    public EmployeeServiceImpl(){
//
//    }
//
//    @Override
//    public List<Employee> getEmployeeList() {
//
//        return employeeRepository.findAll();
//    }
//
//    @Override
//    public Employee getEmployeeById(Long id) {
//        return employeeRepository.getById(id);
//    }
//
//    @Override
//    public Employee addById(Long id) {
//
//    return employeeRepository.save(addById(id));
//    }
//
//    @Override
//    public Employee updateEmployee(Long id, Employee updateEmployee)
//    {
//        return employeeRepository.save(updateEmployee);
//    }
//
//
//    @Override
//    public void deleteEmployeeById(Long id) {
//        this.employeeRepository.deleteById(id);
//
//    }
//}
//
