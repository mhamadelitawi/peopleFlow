package com.mhamadelitawi.peopleFlow.src.repository;

import com.mhamadelitawi.peopleFlow.src.model.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee , Integer> {

    public Employee findByName(String name);
}
