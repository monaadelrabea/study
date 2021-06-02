package com.mongo.example.mongodemo.repository;

import com.mongo.example.mongodemo.model.Employee;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.test.context.ActiveProfiles;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Name : EmployeeRepositoryTest
 * <br>
 * Description :
 * <br>
 * Date : 01/06/2021
 * <br>
 * Create by : Mona Adel
 * <br>
 * Mail : mona.adel@afaqy.com
 */
@DataMongoTest
@ActiveProfiles("test")
class EmployeeRepositoryTest {

    @Autowired
    EmployeeRepository employeeRepository;

    @Test
    void saveEmployeeTest() {
        Employee employee = new Employee();
        employee.setName("Emp1");
        employee.setPosition("POS1");
        employee.setSalary(4563);
        Employee savedEmp = employeeRepository.save(employee);
        assertNotNull(savedEmp);
        assertNotNull(savedEmp.getId());
        assertEquals("Emp1", savedEmp.getName());
        assertEquals("POS1", savedEmp.getPosition());
        assertEquals(4563, savedEmp.getSalary());
    }

    @Test
    void UpdateEmployeeTest() {
        Employee employee = new Employee();
        employee.setName("Emp1");
        employee.setPosition("POS1");
        employee.setSalary(4563);
        Employee savedEmp = employeeRepository.save(employee);
        assertNotNull(savedEmp);
        assertEquals("Emp1", savedEmp.getName());

        savedEmp.setName("Emp2");

        Employee updatedEmp = employeeRepository.save(employee);
        assertNotNull(updatedEmp);
        assertEquals("Emp2", updatedEmp.getName());
    }

    @Test
    void saveAllTest() {
        List<Employee> employees = Stream.of(1, 2, 3, 4).map(count -> {
            Employee employee = new Employee();
            employee.setName("Emp" + count);
            employee.setPosition("POS" + count);
            employee.setSalary(4563 + (count * 10 + 45 + count));
            return employee;
        }).collect(Collectors.toList());

        List<Employee> allSaved = employeeRepository.saveAll(employees);
        assertFalse(allSaved.isEmpty());
        assertEquals(4, allSaved.size());
        assertEquals("Emp2", allSaved.get(1).getName());
    }

}
