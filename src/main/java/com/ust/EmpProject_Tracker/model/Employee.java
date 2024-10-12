package com.ust.EmpProject_Tracker.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="Employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO
    )
    private Long id;
    private String Emp_name;

    @OneToMany(mappedBy = "employee")
    private List<Interview> interviews;

}
