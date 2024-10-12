package com.ust.EmpProject_Tracker.Repository;

import com.ust.EmpProject_Tracker.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpRepository extends JpaRepository<Employee,Long> {
}
