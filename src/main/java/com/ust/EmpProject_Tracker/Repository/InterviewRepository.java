package com.ust.EmpProject_Tracker.Repository;

import com.ust.EmpProject_Tracker.model.Employee;
import com.ust.EmpProject_Tracker.model.Interview;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InterviewRepository extends JpaRepository<Interview, Long> {

    List<Interview> findByProjectId(Long projectId);

    List<Interview> findByProjectIdAndStatus(Long projectId, Interview.InterviewStatus status);

    @Query("SELECT i.employee FROM Interview i WHERE i.project.id = :projectId")
    List<Employee> findEmployeesByProjectId(@Param("projectId") Long projectId);

    @Query("SELECT i.employee FROM Interview i WHERE i.project.id = :projectId AND i.status = :status")
    List<Employee> findFailedInterviewEmployeesByProjectId(@Param("projectId") Long projectId, @Param("status") Interview.InterviewStatus status);
}
