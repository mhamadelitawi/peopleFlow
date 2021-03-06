package com.mhamadelitawi.peopleFlow.src.controller;

import com.mhamadelitawi.peopleFlow.src.model.Employee;
import com.mhamadelitawi.peopleFlow.src.model.StatusParam;
import com.mhamadelitawi.peopleFlow.src.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {


    @Autowired
    private EmployeeService employeeService;




    @PostMapping("/add")
    @ResponseStatus(HttpStatus.CREATED)
    public void createEmploye(@RequestBody(required = true)  Employee employee) {
        employeeService.createEmployee(employee);
    }



    @PostMapping("/update")
    @ResponseStatus(HttpStatus.OK)
    public void update(@RequestBody(required = true) StatusParam param) {
        employeeService.updateStatus(param);
    }


}
