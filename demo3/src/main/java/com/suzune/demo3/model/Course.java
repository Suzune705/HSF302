package com.suzune.demo3.model;


import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "Courses")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "course_id")
    private Integer id ;
    @Column(name = "course_name", length = 150 , nullable = false)
    private String courseName ;
    @OneToMany(mappedBy = "course")
    private List<StudentCourse> studentCourseList;
}
