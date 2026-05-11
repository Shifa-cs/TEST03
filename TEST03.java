
package com.mycompany.test03;

import java.util.Scanner;


public class TEST03 {

    public static void main(String[] args) {
        
      
        Scanner sc = new Scanner(System.in);

        System.out.println("===== ONLINE ADVISING SYSTEM =====");
        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter ID: ");
        String id = sc.nextLine();

        System.out.print("Enter Department: ");
        String dept = sc.nextLine();

        Student s = new Student(name, id, dept);
        Advisor a = new Advisor("Dr. Rahman");
        AdvisingSystem system = new AdvisingSystem(s, a);

        Course c1 = new Course("CSE101", "Programming", 3);
        Course c2 = new Course("CSE102", "Data Structures", 3);
        Course c3 = new Course("MAT101", "Calculus", 3);
        Course c4 = new Course("ENG101", "English", 2);

        int choice;

        do {
            System.out.println("\n1. Add Course");
            System.out.println("2. Drop Course");
            System.out.println("3. View Courses");
            System.out.println("4. Search Course");
            System.out.println("5. Show Summary");
            System.out.println("6. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("\nAvailable Courses:");
                    c1.displayCourse();
                    c2.displayCourse();
                    c3.displayCourse();
                    c4.displayCourse();

                    System.out.print("Enter course code: ");
                    String code = sc.next();

                    if (code.equalsIgnoreCase("CSE101")) system.addCourse(c1);
                    else if (code.equalsIgnoreCase("CSE102")) system.addCourse(c2);
                    else if (code.equalsIgnoreCase("MAT101")) system.addCourse(c3);
                    else if (code.equalsIgnoreCase("ENG101")) system.addCourse(c4);
                    else System.out.println("Invalid course code!");
                    break;

                case 2:
                    System.out.print("Enter course code to drop: ");
                    system.dropCourse(sc.next());
                    break;

                case 3:
                    system.showCourses();
                    break;

                case 4:
                    System.out.print("Enter course code to search: ");
                    system.searchCourse(sc.next());
                    break;

                case 5:
                    system.showSummary();
                    break;

                case 6:
                    System.out.println("Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 6);

        sc.close();
    }
}
    

