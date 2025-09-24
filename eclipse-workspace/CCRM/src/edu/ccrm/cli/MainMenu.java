package edu.ccrm.cli;

import java.util.Scanner;
import edu.ccrm.config.DataStore;
import edu.ccrm.domain.*;

public class MainMenu {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        DataStore ds = DataStore.getInstance();

        outer:
        while(true){
            System.out.println("\nCCRM MAIN MENU");
            System.out.println("1) Add Student  2) List Students  3) Add Course  4) List Courses  5) Exit");
            System.out.print("> ");
            String choice = sc.nextLine();
            switch(choice){
                case "1" -> {
                    System.out.print("Enter ID: ");
                    String id = sc.nextLine();
                    System.out.print("Enter RegNo: ");
                    String reg = sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Email: ");
                    String email = sc.nextLine();
                    Student s = new Student(id, reg, name, email, java.time.LocalDate.now());
                    ds.getStudents().put(id, s);
                    System.out.println("Student added: " + s);
                }
                case "2" -> ds.getStudents().values().forEach(System.out::println);
                case "3" -> {
                    System.out.print("Enter Code: ");
                    String code = sc.nextLine();
                    Course c = new Course.Builder(code)
                            .title("Sample")
                            .credits(3)
                            .department("CS")
                            .semester(Semester.SPRING)
                            .instructor("Dr. Rao")
                            .build();
                    ds.getCourses().put(code, c);
                    System.out.println("Course added: " + c);
                }
                case "4" -> ds.getCourses().values().forEach(System.out::println);
                case "5" -> { System.out.println("Goodbye!"); break outer; }
                default -> System.out.println("Invalid option");
            }
        }
        sc.close();
    }
}
