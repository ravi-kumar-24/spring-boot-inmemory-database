package com.ravi.springbootinmemorydatabase.service;

import com.ravi.springbootinmemorydatabase.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface UserService  {
    List<Users> findByName(String name);

}
