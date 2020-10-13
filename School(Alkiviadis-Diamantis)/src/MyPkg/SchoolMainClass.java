package MyPkg;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class SchoolMainClass {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Student> studentList = new ArrayList();
        ArrayList<Course> courseList = new ArrayList();
        ArrayList<Trainer> trainerList = new ArrayList();
        ArrayList<Assignment> assignmentList = new ArrayList();
        PrintMsg.introMsg();

        boolean loop = true;
        while (loop) {
            int choice = Menu.mainMenu(input);

            switch (choice) {
                case 1: {
                    boolean chek = true;
                    while (chek) {
                        int choice1 = Menu.syntheticDataMenu(input);

                        switch (choice1) {
                            case 1: {
                                studentList = SyntheticData.studentSyntheticList();
                                System.out.println("**********************************************************");
                                System.out.println("*****************Students successfully added**************");
                                break;
                            }
                            case 2: {
                                courseList = SyntheticData.courseSyntheticList();
                                System.out.println("**********************************************************");
                                System.out.println("****************Courses successfully added***************");
                                break;

                            }
                            case 3: {
                                trainerList = SyntheticData.trainerSyntheticList();
                                System.out.println("**********************************************************");
                                System.out.println("*****************Trainers successfully added**************");
                                break;
                            }
                            case 4: {
                                assignmentList = SyntheticData.assigmentSyntheticList();
                                System.out.println("**********************************************************");
                                System.out.println("***************Assigments successfully added***************");
                                break;
                            }
                            case 5: {
                                chek = false;
                            }

                        }
                    }
                }
                break;
                case 2: {
                    Menu.menuAddElements(input, studentList, trainerList, courseList, assignmentList);
                    break;
                }
                case 3: {
                    Menu.menuConstractACourse(input, studentList, trainerList, courseList, assignmentList);
                    break;
                }
                case 4: {
                    PrintMsg.purchaseMsg();
                    break;
                }
                case 5: {
                    boolean loop1 = true;
                    while (loop1) {
                        choice = Menu.detailsMenu(input);

                        switch (choice) {
                            case 1: {
                                Menu.printListOfChoice(input, studentList, courseList, trainerList, assignmentList);
                                break;

                            }
                            case 2: {
                                Details.printStudentDetails(input, studentList);
                                break;

                            }
                            case 3: {
                                Details.printCourseDetails(input, courseList);
                                break;

                            }
                            case 4: {

                                ArrayList<Student> studentListWithmoreCourses = Details.getStudentThatHaveMoreCourses(studentList);
                                for (Student stud : studentListWithmoreCourses) {
                                    System.out.println(stud);
                          
                                }

                                break;
                            }
                            case 5: {
                                checkDeadlines(studentList);

                            }
                            case 6: {
                                loop1 = false;
                                break;

                            }
                        }

                    }
                }
                break;

                case 6: {
                    PrintMsg.outroMsg();
                    loop = false;
                    break;

                }
            }
        }
        input.close();

    }

 //*****************************CHECK DEADLINES**********************************************
    public static void checkDeadlines(ArrayList<Student> studentList) {
        Scanner input = new Scanner(System.in);
        boolean tsek = true;
        final String dateformater = "dd/MM/yyyy HH:mm";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(dateformater);
        LocalDateTime dateTime = null;
        while (tsek) {
            System.out.println("*********************-ASSIGMENT DEADLINES-***********************");

            System.out.print("Please insert Date and Time (dd/MM/yyyy HH:mm): ");

            String dayTime = input.nextLine();
            try {
                dateTime = LocalDateTime.parse(dayTime, formatter);
                tsek = false;
            } catch (Exception e) {
                System.out.println("ERROR!!:Invalid Date Format ");
            }
        }

        LocalDateTime day = dateTime;
        LocalDateTime firstDateOfWeek = day;
        while (firstDateOfWeek.getDayOfWeek() != DayOfWeek.MONDAY) {
            firstDateOfWeek = firstDateOfWeek.minusDays(1);
        }

        LocalDateTime lastDateOfWeek = firstDateOfWeek.plusDays(4);
        int i = 1;

        for (Student student : studentList) {
            for (Course course : student.getStudentCoursesList()) {
                for (Assignment assignment : course.getCourseAssigmentsList()) {

                    if (assignment.getSubDateTime().isAfter(firstDateOfWeek) && assignment.getSubDateTime().isBefore(lastDateOfWeek)) {

                        System.out.println(i + "." + student.getFirstName().toUpperCase() + " " + student.getLastName().toUpperCase() + " Has to submit " + assignment.getTitle() + " Until " + assignment.getSubDateTime());
                        i++;
                    }

                }

            }
        }

    }
    

}
