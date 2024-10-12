package com.ust.EmpProject_Tracker.Service;

import com.ust.EmpProject_Tracker.Repository.EmpRepository;
import com.ust.EmpProject_Tracker.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpService {

    @Autowired
    private EmpRepository empRepository;

    public List<Employee> getAllEmployees() {
        return empRepository.findAll();
    }


    public Employee createEmployee( Employee employee) {
        return empRepository.save(employee);
    }
}
