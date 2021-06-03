package com.redis.example.redisdemo.controller;

import com.redis.example.redisdemo.model.Employee;
import com.redis.example.redisdemo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Name : EmployeeController
 * <br>
 * Description :
 * <br>
 * Date : 01/06/2021
 * <br>
 * Create by : Mona Adel
 * <br>
 * Mail : mona.adel@afaqy.com
 */
@RestController
public class EmployeeController {

    private final EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeController(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @PostMapping("/employees")
    public ResponseEntity<Employee> createEmployee(@RequestBody Employee employee) {
        Employee savedEmployee = employeeRepository.save(employee);
        return new ResponseEntity<>(savedEmployee, HttpStatus.CREATED);
    }

    @PutMapping("/employee/{id}")
    public ResponseEntity<Employee> updateEmployee(@PathVariable(name = "id") String id,
            @RequestBody Employee employee) {
        Optional<Employee> std = employeeRepository.findById(id);
        if(std.isPresent()) {
            Employee employeeDB = std.get();
            employeeDB.setSalary(employee.getSalary());
            employeeDB.setName(employee.getName());
            Employee updatedEmployee = employeeRepository.save(employeeDB);
            return new ResponseEntity<>(updatedEmployee, HttpStatus.CREATED);
        }
        return null;
    }

    @GetMapping("/employees")
    public ResponseEntity<List<Employee>> getEmployees() {
        List<Employee> employees = new ArrayList<>();
        employeeRepository.findAll().forEach(employees::add);
        return new ResponseEntity<>(employees, HttpStatus.OK);
    }

    @DeleteMapping("/employee/{id}")
    public ResponseEntity<String> deleteEmployee(@PathVariable(name = "id") String id) {
        employeeRepository.deleteById(id);
        return new ResponseEntity<>("Employee with id:" + id + " deleted successfully", HttpStatus.OK);
    }

}

