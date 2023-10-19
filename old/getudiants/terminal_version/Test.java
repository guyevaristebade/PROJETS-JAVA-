package terminal_version;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int option = 0;
        List<Student> list = new ArrayList<Student>();

        while (option != 4){
            Test.menu();
            try {
                option = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("!!! Attention, please enter a number !!!");
                scanner.next(); // Clear the input buffer to avoid infinite loop
            }

            switch (option) {
                case 1:
                    System.out.println("Selected option: Add a new student\n");
                    try {
                        System.out.print("Please enter the student's name: ");
                        String name = scanner.next(); 
                        System.out.print("Please enter the student's course: ");
                        String course = scanner.next();
                        System.out.print("Please enter the student's grade: ");
                        double grade = scanner.nextInt();
                        list.add(new Student(name, course, option));
                        System.out.println("Student added successfully!");
                        Test.pause();
                    } catch (Exception e) {
                        System.out.println("Please check your entries \n");
                        scanner.next(); // Clear the buffer and return to the main menu
                    }

                    break;
                case 2 : 
                    System.out.println("Selected option: Display the list of students\n\nList of students:");
                    Test.toString(list);
                    Test.pause();
                    break;

                case 3 : 
                    System.out.println("Selected option: Search for a student by name\n\nPlease enter the student's name to search for: ");

                    try {
                        String search = scanner.next();
                        Student student = Test.getContaintName(list, search);
                        if(student != null){
                            Test.displayStudentByName(student);
                            Test.pause();
                        }else{
                            System.out.println("No student found");
                            Test.pause();
                        }
                    } catch (Exception e) {
                        System.out.println("Please check your entries \n");
                        scanner.next(); // Clear the buffer and return to the main menu
                    }
                    break;
            }

        }
    }

    public static void  menu(){
        System.out.println("Welcome to the Student Manager!\n\nMenu:\n\n1. Add a new student\n2. Display the list of students\n3. Search for a student by name\n4. Quit\n\nPlease enter the option number you want to select: ");
    }

    public static void toString(List<Student> students){
        if(students.size()  != 0){
            int index = 1;
            for(Student student : students){
                System.out.println(index + ". Name:"+ student.getStudentName() + " | Course:" + student.getStudentCourse() + " | Grade:" + student.getStudentNote());
                index++;
            }
        }else{
            System.out.println("The list of students is empty");
        }
    }

    public static void pause(){
        try {
            // Pause for 3 seconds (3000 milliseconds)
            System.out.println("Please wait....");
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.getCause();
        }
    }

    public static Student getContaintName(List<Student> students, String name){
        if(students.size() != 0){
            for(Student student : students){
                if( student.getStudentName().startsWith(name)){
                    return student;
                }
            }
        }else{
            System.out.println("The list of students is empty");
        }

        return null;
    }

    public static void displayStudentByName(Student e){
        System.out.println("Name: "+ e.getStudentName() +" | Course: "+ e.getStudentCourse() + " | Grade: "+ e.getStudentNote());
    }
}
