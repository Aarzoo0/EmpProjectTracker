package com.ust.EmpProject_Tracker.Service;

import com.ust.EmpProject_Tracker.Repository.ProjRepository;
import com.ust.EmpProject_Tracker.model.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectService {
    @Autowired
    private ProjRepository projRepository;


    public List<Project> getAllProjects() {
        return projRepository.findAll();
    }


    public Project createProject( Project project) {
        return projRepository.save(project);
    }
}
