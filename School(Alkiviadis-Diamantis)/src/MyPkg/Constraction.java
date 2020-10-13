package MyPkg;

import java.util.ArrayList;
import java.util.Scanner;

public class Constraction {
    //******************************** STUDENTS PER COURSE METHOD ****************************************//

    public static void studensPerCourse(Scanner input, ArrayList<Student> studentList, Course course) {

        String name;
        String lastName;
        boolean loop = true;
        while (loop) {
            System.out.println("********************-ADD STUDENT-TO-" + course.getTitle().toUpperCase() + "-********************************");
            System.out.println("Enter First name and Last Name to add the student : ");
            System.out.println("Choose from the following Student List ");

            for (Student student : studentList) {
                if (course.getCourseStudentsList().contains(student)) {
                    continue;
                }
                System.out.println("NAME: " + student.getFirstName() + ",  LAST NAME: " + student.getLastName());

            }
            System.out.println("(Press \"back\" to go to " + course.getTitle().toUpperCase() + " MENU)");
            System.out.print("Enter First Name : ");
            name = input.next();
            if (name.equals("back")) {
                loop = false;
                break;

            }
            System.out.print("Enter Last Name : ");
            lastName = input.next();
            for (int i = 0; i < studentList.size(); i++) {

                if (studentList.get(i).getFirstName().equals(name) && studentList.get(i).getLastName().equals(lastName)) {
                    course.addCourseStudentsList(studentList.get(i));
                    studentList.get(i).addStudentCoursesList(course);
                    System.out.println("************************************************************************");
                    System.out.println("* GREAT!! " + studentList.get(i).getFirstName() + " " + studentList.get(i).getLastName() + " is added to " + course.getTitle());
                    break;
                } else if (i == studentList.size() - 1) {
                    System.out.println("****************************************************************");
                    System.out.println("***ERROR : Cannot find Student  " + name + " " + lastName + " please try again ");

                }

            }

        }

    }
    //************************************** TRAINER PER COURSE ****************************************************************//

    public static void trainerPerCourse(Scanner input, ArrayList<Trainer> trainerList, Course course) {

        String trainersName;
        String traineLastName;
        boolean loop = true;
        while (loop) {
            System.out.println("*******************-ADD TRAINER-TO-" + course.getTitle().toUpperCase() + "-*********************************");
            System.out.println("Enter First name and Last name to add the the Trainer : ");
            System.out.println("Choose from the following tainer  List ");

            for (Trainer trainer : trainerList) {
                if (course.getCourseTrainersList().contains(trainer)) {
                    continue;
                }
                System.out.println("Name : " + trainer.getFirstName() + ",  Last Name : " + trainer.getLastName());
            }
            System.out.println("(Press \"back\" to go to " + course.getTitle().toUpperCase() + " MENU)");
            System.out.print("Enter Name : ");
            trainersName = input.next();
            if (trainersName.equals("back")) {
                loop = false;
                break;
            }
            System.out.print("Enter Last Name : ");
            traineLastName = input.next();
            for (int i = 0; i < trainerList.size(); i++) {

                if (trainerList.get(i).getFirstName().equals(trainersName) && trainerList.get(i).getLastName().equals(traineLastName)) {
                    course.addCourseTrainersList(trainerList.get(i));
                    System.out.println("************************************************************************************");
                    System.out.println("* GREAT!! " + trainerList.get(i).getFirstName() + " " + trainerList.get(i).getLastName() + " Added to " + course.getTitle());
                    break;
                } else if (i == trainerList.size() - 1) {
                    System.out.println("*****************************************");
                    System.out.println("ERROR!! : Cannot find  name  please try again ");

                }

            }

        }

    }
    //************************************ASSIGMENT PER COURSE ******************************************************//

    public static void assigmentPerCourse(Scanner input, ArrayList<Assignment> assigmentList, Course course) {

        String titleName;
        boolean loop = true;
        while (loop) {
            System.out.println("********************-ADD ASSIGMENT-TO-" + course.getTitle().toUpperCase() + "-********************************");

            System.out.println("Choose from the following Assigment  List ");

            for (Assignment assignment : assigmentList) {
                if (course.getCourseAssigmentsList().contains(assignment)) {
                    continue;
                }
                System.out.println("Title : " + assignment.getTitle());
            }

            System.out.println("(Press \"back\" to go to " + course.getTitle().toUpperCase() + " MENU)");
            System.out.println("Enter \"Title\"  to add Assigment to " + course.getTitle() + " Course  : ");
            System.out.print("Enter Title : ");

            titleName = input.next();
            if (titleName.equals("back")) {
                loop = false;
                break;
            }
            for (int i = 0; i < assigmentList.size(); i++) {

                if (assigmentList.get(i).getTitle().equals(titleName)) {
                    course.addCourseAssigmentsList(assigmentList.get(i));
                    System.out.println("********************************************************************");
                    System.out.println("* GREAT!! " + "\"" + assigmentList.get(i).getTitle() + "\"" + " Added to " + course.getTitle());
                    break;
                } else if (i == assigmentList.size() - 1) {
                    System.out.println("*******************************************************************");
                    System.out.println("****ERROR!! : There is no such a Title try again ");

                }

            }

        }

    }

}
