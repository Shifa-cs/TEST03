
package com.mycompany.test03;


public class Student {
    
   private String name;
   private String id;
   private String department;

    Student(String name, String id, String department) {
        this.name = name;
        this.id = id;
        this.department = department;
    }

    void showInfo() {
        System.out.println("\nStudent Info:");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Department: " + department);
    }
}
    

