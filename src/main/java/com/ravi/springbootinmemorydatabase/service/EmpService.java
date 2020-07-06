package com.ravi.springbootinmemorydatabase.service;

import com.ravi.springbootinmemorydatabase.model.Employee;
import com.ravi.springbootinmemorydatabase.model.Users;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface EmpService {
    List<Employee> findByName(String name);

}
