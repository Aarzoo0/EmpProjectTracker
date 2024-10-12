package com.ust.EmpProject_Tracker.Controller;

import com.ust.EmpProject_Tracker.Service.EmpService;
import com.ust.EmpProject_Tracker.Service.InterviewService;
import com.ust.EmpProject_Tracker.Service.ProjectService;
import com.ust.EmpProject_Tracker.model.Employee;
import com.ust.EmpProject_Tracker.model.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/tracker")
public class MainController {

    @Autowired
    private InterviewService interviewService;

    @Autowired
    private EmpService empService;

    @Autowired
    private ProjectService projectService;

    // 1. Endpoint to get names of employees working on a specific project
    @GetMapping("/project/{projectId}/employees")
    public List<String> getEmployeeNamesForProject(@PathVariable Long projectId) {
        List<Employee> employees = interviewService.getEmployeesForProject(projectId);
        return employees.stream()
                .map(Employee::getEmp_name)
                .collect(Collectors.toList());
    }

    // 2. Endpoint to get names of employees who failed the interview for a specific project
    @GetMapping("/project/{projectId}/failed-employees")
    public List<String> getFailedInterviewEmployeeNamesForProject(@PathVariable Long projectId) {
        List<Employee> failedEmployees = interviewService.getFailedInterviewEmployeesForProject(projectId);
        return failedEmployees.stream()
                .map(Employee::getEmp_name)
                .collect(Collectors.toList());
    }

    @GetMapping("/allEmployees")
    public List<Employee> getAllEmployees() {
        return empService.getAllEmployees();
    }

    @PostMapping("/employee")
    public Employee createEmployee(@RequestBody Employee employee) {
        return empService.createEmployee(employee);
    }

    @GetMapping("/allProjects")
    public List<Project> getAllProjects() {
        return projectService.getAllProjects();
    }

    @PostMapping("/projects")
    public Project createProject(@RequestBody Project project) {
        return projectService.createProject(project);
    }
}
