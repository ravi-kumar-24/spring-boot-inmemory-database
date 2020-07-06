package com.ravi.springbootinmemorydatabase.service;

import com.ravi.springbootinmemorydatabase.model.Employee;
import com.ravi.springbootinmemorydatabase.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpRepository extends JpaRepository<Employee, Long> , EmpService{


}
