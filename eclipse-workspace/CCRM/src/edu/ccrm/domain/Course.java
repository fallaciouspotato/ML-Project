package edu.ccrm.domain;

import java.util.Objects;

public final class Course {
    private final String code;
    private String title;
    private int credits;
    private String instructor;
    private Semester semester;
    private String department;
    private boolean active = true;

    private Course(Builder b){
        this.code = b.code;
        this.title = b.title;
        this.credits = b.credits;
        this.instructor = b.instructor;
        this.semester = b.semester;
        this.department = b.department;
    }

    public static class Builder {
        private final String code;
        private String title;
        private int credits;
        private String instructor;
        private Semester semester;
        private String department;

        public Builder(String code) { this.code = Objects.requireNonNull(code); }
        public Builder title(String t){ this.title = t; return this; }
        public Builder credits(int c){ this.credits = c; return this; }
        public Builder instructor(String i){ this.instructor = i; return this; }
        public Builder semester(Semester s){ this.semester = s; return this; }
        public Builder department(String d){ this.department = d; return this; }
        public Course build(){ return new Course(this); }
    }

    public String getCode(){ return code; }
    public int getCredits(){ return credits; }
    public String getInstructor(){ return instructor; }
    public Semester getSemester(){ return semester; }
    public String getDepartment(){ return department; }
    public boolean isActive(){ return active; }
    public void deactivate(){ active = false; }

    @Override
    public String toString(){
        return String.format("Course[%s %s (%d credits) - %s/%s]", code, title, credits, department, semester);
    }
}
