package com.suzune.demo3.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "Departments")
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "dept_id")
    private Integer id ;
    @Column(name = "dept_name", length = 100 , nullable = false)
    private String deptName;
    @OneToMany(mappedBy = "department")
    private List<Employee> employeeList ;
}
