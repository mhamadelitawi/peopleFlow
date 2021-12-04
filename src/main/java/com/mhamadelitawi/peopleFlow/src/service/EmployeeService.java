package com.mhamadelitawi.peopleFlow.src.service;

import com.google.gson.Gson;
import com.mhamadelitawi.peopleFlow.src.kafka.KafkaProducer;
import com.mhamadelitawi.peopleFlow.src.model.Employee;
import com.mhamadelitawi.peopleFlow.src.model.StateMachine;
import com.mhamadelitawi.peopleFlow.src.model.StatusParam;
import com.mhamadelitawi.peopleFlow.src.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {


    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private KafkaProducer producer;

    public void createEmployee( Employee employee) {
        employee.setStatus(StateMachine.ADDED);
        producer.sendMessage(employee.toString());
    }




    public void updateStatus(StatusParam param)  {

        if(param.getName() != null && param.getStatus() != null)
        {
            Employee employee = employeeRepository.findByName(param.getName());
            if(employee != null)
            {
                employee.setStatus(param.getStatus());
                producer.sendMessage(employee.toString());
            }
        }
    }



    public void saveEmployee(String message)
    {
        Employee employee = new Gson().fromJson(message , Employee.class);
        employeeRepository.save(employee);
    }







}
