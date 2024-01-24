package com.priyu.controller;

import com.priyu.entity.Employee;
import com.priyu.repository.EmployeeRepository;
import com.priyu.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@RestController
@RequestMapping("employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;
@Autowired
    EmployeeRepository employeeRepository;

    //get the employees detail
    @GetMapping("/all")
    public List<Employee> getAllEmployees() {
        System.out.println("inside get all employee method off employee controller");
        return employeeRepository.findAll();
    }

//Single employee details get
    @GetMapping("/showby/{id}")
    public ResponseEntity<Employee> getbyid(@PathVariable Long id) {
        try{
            return ResponseEntity.ok(employeeRepository.findById(id).get());
        }catch (Exception e){
            return ResponseEntity.ok(null);
        }

    }

   //employee details add
    @PostMapping("/add")
    public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee) {
        return ResponseEntity.ok(employeeRepository.save(employee));
    }


    //update employee details using put request
    @PutMapping("/update/{id}")
    public ResponseEntity<Boolean> updateEmployee(@PathVariable Long id,@RequestBody Employee employeeDetails) {
        if(employeeService.updateEmployee(id,employeeDetails)){
            return ResponseEntity.ok(true);
        }
        return ResponseEntity.ok(false);
    }

//delete employee details using delete request
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Boolean> deleteEmployeeById(@PathVariable Long id) {
        return ResponseEntity.ok(employeeService.deleteEmployeeById(id));
    }
}
