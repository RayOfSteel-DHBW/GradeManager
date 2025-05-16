package com.school;

import java.util.Scanner;

public class GradeManager {
    private GradeDataRepository gradeDataRepository;


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        System.out.println("Welcome to GradeManager!");

        while (running) {
            System.out.println("\nMenu:");
            System.out.println("[1] View Grades");
            System.out.println("[2] New Course");
            System.out.println("[3] Enter Grade");
            System.out.println("[4] Calculate GPA");
            System.out.println("[5] Change File Mode");
            System.out.println("[5] Exit");
            System.out.print("Choose an option: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    System.out.println("[1] View Grades");
                    break;
                case "2":
                    System.out.println("[2] New Course");
                    // TODO: Implement add grade
                    break;
                case "3":
                    System.out.println("[3] Enter Grade");
                    // TODO: Implement view grades
                    break;
                case "4":
                    running = false;
                    System.out.println("Exiting GradeManager. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }

        scanner.close();
    }
}