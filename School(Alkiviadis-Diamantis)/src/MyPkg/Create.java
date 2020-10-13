package MyPkg;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class Create {

    //*********************CREATE STUDENT LIST METHOD*****************************//
    public static ArrayList<Student> createStudent(Scanner input, ArrayList studentList) {

        System.out.println("********** Create Student *********");
        System.out.print("Please insert name : ");
        String name = input.next();
        System.out.print("Please insert Last name : ");
        String Lastname = input.next();
        boolean check = true;
        LocalDate dateFromString = null;
        while (check) {
            try {
                System.out.print("Please insert Birth Date (dd/MM/yyyy): ");
                DateTimeFormatter formatedDate = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                String date = input.next();
                dateFromString = LocalDate.parse(date, formatedDate);
                check = false;
            } catch (Exception e) {
                System.out.println("ERROR!!: Invalid date pattern ");
            }
        }
        System.out.println("Please insert Tuition Fees ");
        int fees = ValidInput.validInteger(input, 0, 10000);
        Student student = new Student(name, Lastname, dateFromString, fees);
        studentList.add(student);

        return studentList;

    }

    //**********************CREATE COURSE LIST  METHOD******************************// 
    public static ArrayList<Course> createCourse(Scanner input, ArrayList courseList) {

        System.out.println("********** Create Course *********");
        System.out.print("Please insert Title : ");
        String title = input.next();
        System.out.print("Please insert Stream : ");
        String stream = input.next();
        System.out.print("Please insert Type : ");
        String type = input.next();

        DateTimeFormatter formatedDate = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate startingDate = null;
        LocalDate endingDate = null;
        boolean check = true;
        while (check) {

            System.out.print("Please insert Start Date (dd/MM/yyyy): ");

            String date = input.next();
            try {
                startingDate = LocalDate.parse(date, formatedDate);
                check = false;

            } catch (Exception e) {
                System.out.println("ERROR!!:Invalid Date Format Enter again");
            }
        }
        check = true;
        while (check) {

            System.out.print("Please insert End Date (dd/MM/yyyy): ");
            String date = input.next();

            try {
                endingDate = LocalDate.parse(date, formatedDate);
                check = false;
            } catch (Exception e) {
                System.out.println("ERROR!!:Invalid Date Format Enter again");
            }
        }
        Course course = new Course(title, stream, type, startingDate, endingDate);
        courseList.add(course);

        return courseList;

    }
    //************************** CREATE TRAINER LIST METHOD *****************************//

    public static ArrayList<Trainer> createTrainer(Scanner input, ArrayList trainerList) {

        System.out.println("********** Create Trainer *********");
        System.out.print("Please insert First Name : ");
        String firstName = input.next();
        System.out.print("Please insert Last Name : ");
        String lastName = input.next();
        System.out.print("Please insert Subject : ");
        String subject = input.next();
        Trainer trainer = new Trainer(firstName, lastName, subject);
        trainerList.add(trainer);

        return trainerList;

    }
//************************* CREATE ASSIGMENT LIST METHOD ******************************//
    public static ArrayList<Assignment> createAssignment(Scanner input, ArrayList assignmentList) {
        System.out.println("********** Create Assigment *********");
        System.out.print("Please insert Title : ");
        String title = input.nextLine();
        System.out.print("Please insert Description : ");
        String description = input.nextLine();
        boolean tsek = true;
        final String dateformater = "dd/MM/yyyy HH:mm";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(dateformater);
        LocalDateTime dateTime = null;
        while (tsek) {
            System.out.print("Please insert Submision Date (dd/MM/yyyy HH:mm): ");

            String dayTime = input.nextLine();
            try {
                dateTime = LocalDateTime.parse(dayTime, formatter);
                tsek = false;
            } catch (Exception e) {
                System.out.println("ERROR!!:Invalid Date Format ");
            }
        }
        System.out.println("Please insert Total Mark : ");
        int totalMark = ValidInput.validInteger(input, 0, 100);
        Assignment assignment = new Assignment(title, description, dateTime, totalMark);
        assignmentList.add(assignment);

        return assignmentList;
    }

}
