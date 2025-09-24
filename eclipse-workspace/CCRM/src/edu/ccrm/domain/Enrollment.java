package edu.ccrm.domain;

import java.time.LocalDate;

public class Enrollment {
    private final Course course;
    private final LocalDate enrolledOn;
    private Grade grade; // can be null until recorded
    private Integer marks;

    public Enrollment(Course course){
        this.course = course;
        this.enrolledOn = LocalDate.now();
    }
    public Course getCourse(){ return course; }
    public LocalDate getEnrolledOn(){ return enrolledOn; }
    public void recordMarks(int marks, Grade grade){
        this.marks = marks;
        this.grade = grade;
    }
    public Grade getGrade(){ return grade; }
    public Integer getMarks(){ return marks; }

    @Override
    public String toString(){
        return String.format("%s enrolledOn=%s marks=%s grade=%s", course.getCode(), enrolledOn, marks, grade);
    }
}
