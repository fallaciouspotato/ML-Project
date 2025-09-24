package edu.ccrm.domain;

import java.time.LocalDate;
import java.util.*;

public class Student extends Person {
    public enum Status { ACTIVE, INACTIVE, SUSPENDED }

    private String regNo;
    private Status status = Status.ACTIVE;
    private final Map<String, Enrollment> enrollments = new HashMap<>();
    private LocalDate dob;

    public Student(String id, String regNo, String fullName, String email, LocalDate dob){
        super(id, fullName, email);
        this.regNo = regNo;
        this.dob = dob;
    }

    public void enroll(Enrollment e){ enrollments.put(e.getCourse().getCode(), e); }
    public void unenroll(String courseCode){ enrollments.remove(courseCode); }
    public Collection<Enrollment> getEnrollments(){ return Collections.unmodifiableCollection(enrollments.values()); }
    public String getRegNo(){ return regNo; }

    public String role(){ return "Student"; }

    @Override
    public String toString(){
        return String.format("Student[%s, regNo=%s, status=%s, enrollments=%d]", id, regNo, status, enrollments.size());
    }
}
