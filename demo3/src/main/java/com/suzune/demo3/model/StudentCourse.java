package com.suzune.demo3.model;


import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "Student_Course")
public class StudentCourse {

    @EmbeddedId
    private StudentCourseId  id ;
    @Column(name = "enrolled_date", nullable = true)
    private LocalDate enrolledDate ;

    @ManyToOne
    @MapsId("courseId")
    @JoinColumn(name = "course_id")
    private Course course ;
    @ManyToOne
    @MapsId("studentId")
    @JoinColumn(name = "student_id")
    private Student student ;
}
