package com.suzune.demo3.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class StudentCourseId implements Serializable {
    @Column(name = "course_id", nullable = false)
    private Integer courseId ;
    @Column(name = "student_id", nullable = false)
    private Integer studentId;

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof StudentCourseId that)) return false;
        return Objects.equals(courseId, that.courseId) && Objects.equals(studentId, that.studentId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(courseId, studentId);
    }
}
