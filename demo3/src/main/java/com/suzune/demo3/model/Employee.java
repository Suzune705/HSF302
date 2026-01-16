package com.suzune.demo3.model;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "Employees")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "emp_id")
    private Integer id;
    @Column(name = "emp_name", length = 150, nullable = false)
    private String name ;
    @Column(name = "salary", nullable = true, precision = 12 ,scale = 2)
    private BigDecimal salary  ;
    @ManyToOne
    @JoinColumn(name = "dept_id", referencedColumnName = "dept_id", nullable = true)
    private Department department ;
}
