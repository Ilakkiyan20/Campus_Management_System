package com.campus.app; 

import java.util.Scanner;
import com.campus.model.ScholarshipStudent;
import com.campus.model.Student;
import com.campus.service.Studentservice;

public class Main {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int studentId = readInt("Enter student id");
        String studentName = readRequiredString("Enter student name");
        int age = readInt("Enter student age");
        String department = readRequiredString("Enter student department");
        int numberOfSubjects = readInt("Number of subjects");

        int[] marks = new int[numberOfSubjects];
        for (int i = 0; i < numberOfSubjects; i++) {
            marks[i] = readInt("Enter marks of subject " + (i + 1));
        }

        double scholarshipPercentage = readDouble("Enter scholarship percentage");

        Student student = new ScholarshipStudent(studentId, studentName, age, department, marks, scholarshipPercentage);
        student.displaystudentInfo(true);
        student.studentType();
        Student.displayStudentCount();

        Studentservice studentservice = new Studentservice();
        studentservice.displayReportCard(student);

        sc.close();
    }

    private static String readRequiredString(String prompt) {
        while (true) {
            System.out.println(prompt);
            String value = sc.nextLine().trim();
            if (!value.isEmpty()) {
                return value;
            }
            System.out.println("Please enter a valid value.");
        }
    }

    private static int readInt(String prompt) {
        while (true) {
            System.out.println(prompt);
            String input = sc.nextLine().trim();
            try {
                return Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid integer.");
            }
        }
    }

    private static double readDouble(String prompt) {
        while (true) {
            System.out.println(prompt);
            String input = sc.nextLine().trim();
            try {
                return Double.parseDouble(input);
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number.");
            }
        }
    }
}