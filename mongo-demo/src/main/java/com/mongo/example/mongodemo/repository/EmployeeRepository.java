package com.mongo.example.mongodemo.repository;

import com.mongo.example.mongodemo.model.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;
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
public interface EmployeeRepository extends MongoRepository<Employee, String> {

}
