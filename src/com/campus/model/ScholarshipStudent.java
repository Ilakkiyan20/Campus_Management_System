package com.campus.model;

public class ScholarshipStudent extends Student {
    private double scholarshipPercentage;

    public ScholarshipStudent() {
        super();
        this.scholarshipPercentage = 0.0;
    }

    public ScholarshipStudent(int studentid, String studentname, int age, String department, int[] marks) {
        super(studentid, studentname, age, department, marks);
        this.scholarshipPercentage = 0.0;
    }

    public ScholarshipStudent(int studentid, String studentname, int age, String department, int[] marks, double scholarshipPercentage) {
        super(studentid, studentname, age, department, marks);
        this.scholarshipPercentage = scholarshipPercentage;
    }

    public double getScholarshipPercentage() {
        return scholarshipPercentage;
    }

    public void setScholarshipPercentage(double scholarshipPercentage) {
        this.scholarshipPercentage = scholarshipPercentage;
    }

    @Override
    public void studentType() {
        System.out.println("This is a Scholarship Student.");
    }
}