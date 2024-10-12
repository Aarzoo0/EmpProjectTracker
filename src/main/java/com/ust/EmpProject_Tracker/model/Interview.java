package com.ust.EmpProject_Tracker.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Interview")
public class Interview {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "emp_id")
    private Employee employee;


    @ManyToOne
    @JoinColumn(name = "proj_id")
    private Project project;

    @Enumerated(EnumType.STRING)
    private InterviewStatus status;

    public enum InterviewStatus {
        PASSED, FAILED
    }

}
