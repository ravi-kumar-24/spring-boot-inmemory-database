package com.ravi.springbootinmemorydatabase.controller;

import com.ravi.springbootinmemorydatabase.model.Employee;
import com.ravi.springbootinmemorydatabase.service.EmpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/rest/emp")
public class EmployeeController {

    @Autowired
    private EmpRepository empRepository;

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<Employee> getAllEmp(){
        return empRepository.findAll();
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public Employee add(@RequestBody Employee employee){
        return empRepository.save(employee);
    }
}
