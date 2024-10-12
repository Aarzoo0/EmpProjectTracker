package com.ust.EmpProject_Tracker.Repository;

import com.ust.EmpProject_Tracker.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjRepository extends JpaRepository<Project,Long> {
}
