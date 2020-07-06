package com.ravi.springbootinmemorydatabase.service;

import com.ravi.springbootinmemorydatabase.model.Employee;
import com.ravi.springbootinmemorydatabase.model.Users;

import java.util.LinkedList;
import java.util.List;

public class EmpServiceImpl implements EmpService{
    @Override
    public List<Employee> findByName(String name) {
        Employee emp = new Employee(1,"ravi","kumar", "test@gmail.com");
        List lit = new LinkedList();
        lit.add(emp);
        return lit;
    }
}
