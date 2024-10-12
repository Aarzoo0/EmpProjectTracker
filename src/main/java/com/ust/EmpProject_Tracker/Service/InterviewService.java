package com.ust.EmpProject_Tracker.Service;

import com.ust.EmpProject_Tracker.Repository.InterviewRepository;
import com.ust.EmpProject_Tracker.model.Employee;
import com.ust.EmpProject_Tracker.model.Interview;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InterviewService {

    @Autowired
    private InterviewRepository interviewRepository;

    public List<Interview> getAllInterviewsForProject(Long projectId) {
        return interviewRepository.findByProjectId(projectId);
    }

    public List<Interview> getFailedInterviewsForProject(Long projectId) {
        return interviewRepository.findByProjectIdAndStatus(projectId, Interview.InterviewStatus.FAILED);
    }

    public Interview saveInterview(Interview interview) {
        return interviewRepository.save(interview);
    }

    public List<Employee> getFailedInterviewEmployeesForProject(Long projectId) {
        return interviewRepository.findFailedInterviewEmployeesByProjectId(projectId, Interview.InterviewStatus.FAILED);
    }

    public List<Employee> getEmployeesForProject(Long projectId) {
        return interviewRepository.findEmployeesByProjectId(projectId);
    }
}
