package MyPkg;

import java.util.ArrayList;
import java.util.Scanner;

public class Details {
//**********************************COURSE DETAILS METHOD****************************************//

    public static void printCourseDetails(Scanner input, ArrayList<Course> courseList) {

        boolean loopa = true;
        while (loopa) {
            System.out.println("---------------------------------------- COURSE LIST --------------------------------------------");
            for (int i = 0; i < courseList.size(); i++) {
                System.out.println("" + (i + 1) + ". " + courseList.get(i));
            }
            if (courseList.isEmpty()) {
                System.out.println("***********The Course List is empty !! ***********");
                break;

            }
            System.out.println("-----------------------------------------------//----------------------------------------------------------");
            System.out.println("Type a number between 1-" + courseList.size() + " to choose a course to see details");
            int num = ValidInput.validInteger(input, 1, courseList.size());
            System.out.println("---------------- STUDENTS THAT PARTICIPATE TO " + courseList.get(num - 1).getTitle().toUpperCase() + " ARE : " + "-------------------------");
            for (Student student : courseList.get(num - 1).getCourseStudentsList()) {
                System.out.println(student);
            }
            System.out.println("*****************************************************************************");
            System.out.println("---------------- TRAINERS THAT PARTICIPATE TO " + courseList.get(num - 1).getTitle().toUpperCase() + " ARE : " + "-------------------------");
            for (Trainer trainer : courseList.get(num - 1).getCourseTrainersList()) {
                System.out.println(trainer);
            }
            System.out.println("*****************************************************************************");
            System.out.println("---------------- ASSIGMENTS TO " + courseList.get(num - 1).getTitle().toUpperCase() + " ARE : " + "-------------------------");
            for (Assignment assignment : courseList.get(num - 1).getCourseAssigmentsList()) {
                System.out.println(assignment);
            }
            String in = "";
            System.out.println("*****************************************************************************");
            System.out.println("*Want to see the details of other courses ? ");
            while (!in.equals("yes") && !in.equals("no")) {
                System.out.println("Press : \"yes\" to see Course list");
                System.out.println("Press : \"no\" to go back to DETAILS MENU");
                System.out.print("Type \"yes\" or \"no\" Here : ");
                in = input.next();
                if (in.equals("no")) {
                    loopa = false;
                    break;
                }
                if (in.equals("yes")) {
                    loopa = true;
                } else {
                    System.out.println("* ERROR!!! : Invalid input Please Type \"yes\" or \"no\" ");
                }
            }
        }

    }
    //*************************************PRINT STUDENT DETAILS****************************************************//

    public static void printStudentDetails(Scanner input, ArrayList<Student> studentList) {

        boolean loopa = true;
        while (loopa) {
            System.out.println("------------------------------------ STUDENT LIST ----------------------------------");
            for (int i = 0; i < studentList.size(); i++) {
                System.out.println("" + (i + 1) + ". " + studentList.get(i));
            }
            if (studentList.isEmpty()) {
                System.out.println("***********The Student List is empty!! ***********");
                break;

            }
            System.out.println("**********************************************************************************************");
            System.out.println("Type a number between 1-" + studentList.size() + " to choose a student to see details");
            System.out.print("Enter number ");
            int num = ValidInput.validInteger(input, 1, studentList.size());
            System.out.println("------------------------- COURSES THAT  " + studentList.get(num - 1).getFirstName().toUpperCase() + " " + studentList.get(num - 1).getLastName().toUpperCase() + " HAS ARE : " + "-------------------------");
            for (Course course : studentList.get(num - 1).getStudentCoursesList()) {
                System.out.println(course);

            }
            System.out.println("***************************************************************************************************");
            System.out.println("----------------------- ASSIGMENTS THAT  " + studentList.get(num - 1).getFirstName().toUpperCase() + " " + studentList.get(num - 1).getLastName().toUpperCase() + " HAS ARE : " + "-------------------------");
            for (Course course : studentList.get(num - 1).getStudentCoursesList()) {
                for (Assignment assignment : course.getCourseAssigmentsList()) {
                    System.out.println(assignment);
                }

            }
            System.out.println("*****************************************************************************************************");
            System.out.println("Want to see more Student details ? ");
            String in = "";
            while (!in.equals("yes") && !in.equals("no")) {
                System.out.println("Press : \"yes\" to see Student list");
                System.out.println("Press : \"no\" to go back to DETAILS MENU");
                System.out.print("Type \"yes\" or \"no\" Here : ");
                in = input.next();
                if (in.equals("no")) {
                    loopa = false;
                    break;
                }
                if (in.equals("yes")) {
                    loopa = true;
                } else {
                    System.out.println("* ERROR!!! : Invalid input Please Type \"yes\" or \"no\" ");
                }
            }

        }

    }
    //**********************************CHECK IF A STUDENT HAS MORE THAN ONE COURSE****************************//

    public static ArrayList<Student> getStudentThatHaveMoreCourses(ArrayList<Student> studentList) {
        ArrayList<Student> studentListWithmoreCourses = new ArrayList();
        int i = 1;
        System.out.println("******************************************************************************");
        System.out.println("******************-STUDENTS WITH MORE THAN ONE COURSE-************************");
        for (Student student : studentList) {
            if (student.getStudentCoursesList().size() > 1) {

                studentListWithmoreCourses.add(student);
            }
        }

        return studentListWithmoreCourses;
    }

}
