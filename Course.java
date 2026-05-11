
package com.mycompany.test03;

public class Course {
    
    private String courseCode;
    private String courseName;
    private int credit;

    Course(String code, String name, int credit) {
        this.courseCode = code;
        this.courseName = name;
        this.credit = credit;
    }

    String getCode() {
        return courseCode;
    }

    int getCredit() {
        return credit;
    }

    void displayCourse() {
        System.out.println(courseCode + " - " + courseName + " (" + credit + " credits)");
    }

}
    

