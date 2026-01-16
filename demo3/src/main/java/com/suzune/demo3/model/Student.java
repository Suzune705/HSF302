package com.suzune.demo3.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "Students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "student_id")
    private Long id;
    @Column(name = "student_name", length = 150 , nullable = false)
    private String studentName ;

    @OneToMany(mappedBy = "student")
    private List<StudentCourse> studentCourseList ;
}
