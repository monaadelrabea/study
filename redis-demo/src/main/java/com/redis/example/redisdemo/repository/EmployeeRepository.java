package com.redis.example.redisdemo.repository;

import com.redis.example.redisdemo.model.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Name : EmployeeRepository
 * <br>
 * Description :
 * <br>
 * Date : 01/06/2021
 * <br>
 * Create by : Mona Adel
 * <br>
 * Mail : mona.adel@afaqy.com
 */
@Repository
public interface EmployeeRepository extends CrudRepository<Employee, String> {

}
