package com.campus.model;

public class ScholarshipStudent extends Student {
    private double scholarshipPercentage;

    public ScholarshipStudent(int studentid, String studentname, int age, String department, int[] marks, double scholarshipPercentage) {
        super(studentid, studentname, age, department, marks);
        this.scholarshipPercentage = scholarshipPercentage;
    }
    
    //getters and setters
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

    @Override
    public void displaystudentInfo(boolean showMarks) {
        super.displaystudentInfo(showMarks);
        System.out.println("Scholarship Percentage: " + scholarshipPercentage);
    }

    @Override
    public void generateReport() {
        System.out.println("Scholarship student report card");
    }

    @Override
    public void eligibleforScholarship() {
        System.out.println("Eligible for scholarship.");
    }
}
