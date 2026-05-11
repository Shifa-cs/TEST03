
package com.mycompany.test03;

import java.util.ArrayList;
import java.util.Iterator;

public class AdvisingSystem {
    
    private Student student;
    private Advisor advisor;
    private ArrayList<Course> selectedCourses;
    private final int MAX_CREDIT = 12;

    AdvisingSystem(Student student, Advisor advisor) {
        this.student = student;
        this.advisor = advisor;
        selectedCourses = new ArrayList<>();
    }

    boolean isAlreadyAdded(String code) {
        for (Course c : selectedCourses) {
            if (c.getCode().equalsIgnoreCase(code)) {
                return true;
            }
        }
        return false;
    }

    int getTotalCredits() {
        int total = 0;
        for (Course c : selectedCourses) {
            total += c.getCredit();
        }
        return total;
    }

    void addCourse(Course c) {
        if (isAlreadyAdded(c.getCode())) {
            System.out.println("Course already added!");
            return;
        }

        if (getTotalCredits() + c.getCredit() > MAX_CREDIT) {
            System.out.println("Credit limit exceeded!");
            return;
        }

        selectedCourses.add(c);
        System.out.println("Course added successfully!");
    }

    void dropCourse(String code) {
        boolean found = false;

        Iterator<Course> it = selectedCourses.iterator();
        while (it.hasNext()) {
            Course c = it.next();
            if (c.getCode().equalsIgnoreCase(code)) {
                it.remove();
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Course dropped successfully!");
        } else {
            System.out.println("Course not found!");
        }
    }

    void searchCourse(String code) {
        for (Course c : selectedCourses) {
            if (c.getCode().equalsIgnoreCase(code)) {
                System.out.println("Course Found:");
                c.displayCourse();
                return;
            }
        }
        System.out.println("Course not found!");
    }

    void showCourses() {
        System.out.println("\nSelected Courses:");
        if (selectedCourses.isEmpty()) {
            System.out.println("No courses selected.");
        } else {
            for (Course c : selectedCourses) {
                c.displayCourse();
            }
        }
    }

    void showSummary() {
        student.showInfo();
        advisor.giveAdvice();
        showCourses();
        System.out.println("Total Credits: " + getTotalCredits());
    }
}
    

