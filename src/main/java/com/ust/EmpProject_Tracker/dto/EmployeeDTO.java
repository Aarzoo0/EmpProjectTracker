package com.ust.EmpProject_Tracker.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDTO {
    private String name;
    private List<InterviewDTO> interviews;


    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class InterviewDTO {
        private Long projectId;
        private String status;


    }
}
