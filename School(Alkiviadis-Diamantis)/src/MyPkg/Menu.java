package MyPkg;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    
//***************************MAIN MENU QUESTIONS****************************//
    
    public static int mainMenu(Scanner input) {
        System.out.println("***********************************************");
        System.out.println("******************-MAIN MENU-*******************");
        System.out.println("***********************************************");
        System.out.println("Press :");
        System.out.println("1. Add Data From Synthetic Data");
        System.out.println("2. Add Data Manually");
        System.out.println("3. Edit a Course");
        System.out.println("4. Constract a Schedule (LOCKED)");
        System.out.println("5. See More Details  ");
        System.out.println("6. To EXIT ");
        int choice = ValidInput.validInteger(input, 1, 6);
        return choice;
    }

    public static int syntheticDataMenu(Scanner input) {
        System.out.println("*********************************************************");
        System.out.println("*******************-SYNTHETIC DATA MENU-*****************");
        System.out.println("Press :");
        System.out.println("1.  Add  Students ");
        System.out.println("2.  Add  Courses ");
        System.out.println("3.  Add  Trainers ");
        System.out.println("4.  Add  Assigments ");
        System.out.println("5.  Go back to MAIN MENU ");
        int choice1 = ValidInput.validInteger(input, 1, 5);
        return choice1;
    }

    public static int detailsMenu(Scanner input) {
        System.out.println("******************************************************");
        System.out.println("******************* DETAILS MENU *********************");
        System.out.println("Press :");
        System.out.println("1. To See Lists");
        System.out.println("2. To See Student Details ");
        System.out.println("3. To See Course Details ");
        System.out.println("4. To See List of Student with more than one course ");
        System.out.println("5. To See Deadlines ");
        System.out.println("6. To go Back  to MAIN MENU");
        int choice = ValidInput.validInteger(input, 1, 6);
        return choice;
    }

    public static int menuChoice(Scanner input) {

        System.out.println("************************************************");
        System.out.println("********************-ADD MENU-******************");
        System.out.println("************************************************");

        System.out.println("Press :");
        System.out.println("1. To add students");
        System.out.println("2. To add courses");
        System.out.println("3. To add trainers");
        System.out.println("4. To add Assigments");
        System.out.println("5. To go back to MAIN MENU ");

        return ValidInput.validInteger(input, 1, 5);
    }

    public static void menuAddElements(Scanner input, ArrayList<Student> studentList, ArrayList<Trainer> trainerList, ArrayList<Course> courseList, ArrayList<Assignment> assignmentList) {

        boolean start = true;
        while (start) {
            int choice = menuChoice(input);
            switch (choice) {
                case 1:
                    //***********STUDENT LOOP*******//
                    System.out.println("*****************************************************");
                    System.out.println("****************** ADD STUDENTS *********************");

                    System.out.println("How Many Students do you want to add ? ");
                    int count = ValidInput.validInteger(input, 0, 100);
                    for (int i = 0; i < count; i++) {
                        studentList = Create.createStudent(input, studentList);
                        System.out.println("//-------------STUDENT SUCCESSFULLY ADDED --------------//");

                    }
                    break;
                case 2:
                    //************COURSE LOOP********//
                    System.out.println("*****************************************************");
                    System.out.println("******************* ADD COURSES *********************");

                    System.out.println("How many Courses do you want to add?  ");
                    count = ValidInput.validInteger(input, 0, 50);
                    for (int i = 0; i < count; i++) {
                        courseList = Create.createCourse(input, courseList);
                        System.out.println("//--------------COURSE SUCCESSFULLY ADDED-------------//");
                    }
                    break;
                case 3:
                    //***********TRAINER LOOP***********//
                    System.out.println("*****************************************************");
                    System.out.println("******************* ADD TRAINERS ********************");

                    System.out.println("How many Trainers do you want to add? ");
                    count = ValidInput.validInteger(input, 0, 20);
                    for (int i = 0; i < count; i++) {
                        trainerList = Create.createTrainer(input, trainerList);
                        System.out.println("//-----------------TRAINER SUCCESSFULLY ADDED-------------//");
                    }
                    break;
                case 4:
                    //*****************ASSIGMENT LOOP************//
                    System.out.println("*****************************************************");
                    System.out.println("****************** ADD ASSIGMENTS *******************");

                    System.out.println("How many Assigments  do you want to add?  ");
                    count = ValidInput.validInteger(input, 0, 10);
                    for (int i = 0; i < count; i++) {
                        assignmentList = Create.createAssignment(input, assignmentList);
                        System.out.println("//----------ASSIGMENT SUCCESSFULLY ADDED--------//");

                    }
                    break;
                case 5:
                    start = false;

            }
        }

    }
        //********************************----LISTS MENU-------***********************************************//

    public static void printListOfChoice(Scanner input, ArrayList<Student> students, ArrayList<Course> courses,
            ArrayList<Trainer> trainers, ArrayList<Assignment> assigments) {

        boolean start = true;
        while (start) {
            System.out.println("************************************************************************");
            System.out.println("*******************************-LIST MENU-******************************");
            System.out.println("Press :");
            System.out.println("1. To see student list");
            System.out.println("2. To see course list");
            System.out.println("3. To see trainer list");
            System.out.println("4. To see Assigment list");
            System.out.println("5. To go back to MAIN MENU ");
            int choice = ValidInput.validInteger(input, 1, 5);
            switch (choice) {
                case 1:
                    System.out.println("----------------------------------------- THE LIST OF STUDENTS -----------------------------------------");
                    printList(students);
                    break;
                case 2:
                    System.out.println("----------------------------------------- THE LIST OF COURSES ------------------------------------------");
                    printList(courses);
                    break;
                case 3:
                    System.out.println("---------------------------------------- THE LIST OF TRAINERS ------------------------------------------");
                    printList(trainers);
                    break;
                case 4:
                    System.out.println("----------------------------------------- THE LIST OF ASSIGMENTS --------------------------------------");
                    printList(assigments);
                    break;
                case 5:
                    start = false;
                    break;
            }
        }

    }

    public static void menuConstractACourse(Scanner input, ArrayList<Student> studentList, ArrayList<Trainer> trainerList, ArrayList<Course> courseList, ArrayList<Assignment> assignmentList) {

        boolean loopa = true;
        while (loopa) {
            System.out.println("**********************-EDIT COURSES MENU-***********************");

            System.out.println("------------------------- COURSE LIST --------------------------");
            System.out.println("");

            for (int i = 0; i < courseList.size(); i++) {
                System.out.println("" + (i + 1) + "." + courseList.get(i));
            }

            if (courseList.isEmpty()) {
                System.out.println("*********The Course List is Empty***********");
                System.out.println("--Add a Course Manually Or add a Course from Synthetic data--");

                break;
            }
            System.out.println("Choose a course to Edit1");
            int num = ValidInput.validInteger(input, 1, courseList.size());

            boolean loop = true;

            while (loop) {
                System.out.println("**********************************************************************");
                System.out.println("************************-" + courseList.get(num - 1).getTitle().toUpperCase() + "-********************************");

                System.out.println("Press :");
                System.out.println("1. Add students to " + courseList.get(num - 1).getTitle());
                System.out.println("2. Add trainers to " + courseList.get(num - 1).getTitle());
                System.out.println("3. Add Assigments to  " + courseList.get(num - 1).getTitle());
                System.out.println("4. Go back to Course List ");
                System.out.println("5. Add a course ");
                System.out.println("6. Exit Constraction ");
                int choose = ValidInput.validInteger(input, 1, 6);
                switch (choose) {
                    case 1: {
                        Constraction.studensPerCourse(input, studentList, courseList.get(num - 1));
                    }
                    break;
                    case 2: {
                        Constraction.trainerPerCourse(input, trainerList, courseList.get(num - 1));
                    }
                    break;
                    case 3: {
                        Constraction.assigmentPerCourse(input, assignmentList, courseList.get(num - 1));
                    }
                    break;
                    case 4: {
                        loop = false;
                    }
                    break;
                    case 5: {
                        //************COURSE LOOP********//
                        System.out.println("******* ADD COURSES ********");
                        System.out.print("How many Courses do you want to add? : ");
                        int count = input.nextInt();
                        for (int i = 0; i < count; i++) {
                            courseList = Create.createCourse(input, courseList);
                            System.out.println("//----------------//----------------//");
                        }
                    }
                    break;

                    case 6: {
                        loop = false;
                        loopa = false;
                    }
                    break;

                }
            }
        }
    }

    public static void printList(ArrayList x) {
        for (int i = 0; i < x.size(); i++) {
            System.out.println("" + (i + 1) + "." + x.get(i));
        }
    }

}
