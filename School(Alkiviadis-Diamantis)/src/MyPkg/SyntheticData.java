package MyPkg;

import java.time.LocalDate;

import java.util.ArrayList;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class SyntheticData {

    public static ArrayList<Trainer> trainerSyntheticList() {
        ArrayList<Trainer> trainerSynthList = new ArrayList();
        Trainer t1 = new Trainer("Dimitris", "Dimitropoulos", "Java,C#");
        Trainer t2 = new Trainer("Giorgos", "Dimitropoulos", "Python,C#");
        Trainer t3 = new Trainer("Maria", "Dimitropoulou", "Java,Python");
        Trainer t4 = new Trainer("Hristina", "Hristopoulou", "Physics,Python");
        Trainer t5 = new Trainer("Katerina", "Hristopoulou", "Mathematics,Physics");
        Trainer t6 = new Trainer("Maria", "Hristopoulou", "Java,Mathematics");
        trainerSynthList.add(t1);
        trainerSynthList.add(t2);
        trainerSynthList.add(t3);
        trainerSynthList.add(t4);
        trainerSynthList.add(t5);
        trainerSynthList.add(t6);

        return trainerSynthList;
    }

    public static ArrayList<Assignment> assigmentSyntheticList() {
        ArrayList<Assignment> assigmentSynthList = new ArrayList();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        Assignment a1 = new Assignment("AI", "do it well", LocalDateTime.parse("24/03/2020 12:00", formatter), 20);
        Assignment a2 = new Assignment("Java_Programm", "do it well", LocalDateTime.parse("23/03/2020 12:00", formatter), 100);
        Assignment a3 = new Assignment("Python_Programm", "do it well", LocalDateTime.parse("24/03/2020 12:00", formatter), 100);
        Assignment a4 = new Assignment("Thermodynamic", "do it well", LocalDateTime.parse("26/03/2020 12:00", formatter), 100);
        Assignment a5 = new Assignment("Math_Java", "do it well", LocalDateTime.parse("25/03/2020 12:00", formatter), 100);
        Assignment a6 = new Assignment("Applied_physics", " maxwell equations", LocalDateTime.parse("01/01/2021 12:00", formatter), 100);
        Assignment a7 = new Assignment("Combined_proggraming", "java,python,c#", LocalDateTime.parse("10/01/2021 12:00", formatter), 100);
        assigmentSynthList.add(a1);
        assigmentSynthList.add(a2);
        assigmentSynthList.add(a3);
        assigmentSynthList.add(a4);
        assigmentSynthList.add(a5);
        assigmentSynthList.add(a6);
        assigmentSynthList.add(a7);

        return assigmentSynthList;

    }

    public static ArrayList<Course> courseSyntheticList() {
        ArrayList<Course> courseSynthList = new ArrayList();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        Course c1 = new Course("Java", "Java", "Full time", LocalDate.parse("22/02/2019", dateTimeFormatter), LocalDate.parse("26/10/2022", dateTimeFormatter));
        Course c2 = new Course("C#", "C#", "Full time", LocalDate.parse("22/02/2019", dateTimeFormatter), LocalDate.parse("22/02/2022", dateTimeFormatter));
        Course c3 = new Course("Python", "Python", "Part time", LocalDate.parse("22/07/2019", dateTimeFormatter), LocalDate.parse("22/02/2022", dateTimeFormatter));
        Course c4 = new Course("Mathematis", "Mathematis", "Part time", LocalDate.parse("26/10/2019", dateTimeFormatter), LocalDate.parse("22/02/2022", dateTimeFormatter));
        Course c5 = new Course("Physics", "Physics", "Part time", LocalDate.parse("26/11/2019", dateTimeFormatter), LocalDate.parse("22/02/2022", dateTimeFormatter));
        courseSynthList.add(c1);
        courseSynthList.add(c2);
        courseSynthList.add(c3);
        courseSynthList.add(c4);
        courseSynthList.add(c5);
        studentSyntheticList();
        return courseSynthList;
    }

    public static ArrayList<Student> studentSyntheticList() {
        ArrayList<Student> studentSynthList = new ArrayList();

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Student s1 = new Student("John", "Johnopoulos", LocalDate.parse("12/12/1988", dateTimeFormatter), 1000);
        Student s3 = new Student("Adam", "Adamopoulos", LocalDate.parse("11/04/1988", dateTimeFormatter), 1000);
        Student s4 = new Student("Andy", "Korourou", LocalDate.parse("11/05/1988", dateTimeFormatter), 3334);
        Student s5 = new Student("Katerina", "Mitsaki", LocalDate.parse("22/05/1988", dateTimeFormatter), 1000);
        Student s6 = new Student("Hristos", "Hristopoulos", LocalDate.parse("29/06/1897", dateTimeFormatter), 1349);
        Student s7 = new Student("Giorgos", "Hristopoulos", LocalDate.parse("22/04/1988", dateTimeFormatter), 1000);
        Student s8 = new Student("Sotiris", "Hristopoulos", LocalDate.parse("29/09/1988", dateTimeFormatter), 2349);
        Student s9 = new Student("Petros", "Papadolpoulos", LocalDate.parse("22/04/1999", dateTimeFormatter), 1000);
        Student s10 = new Student("Peter", "Agelakos", LocalDate.parse("23/05/1988", dateTimeFormatter), 1000);
        studentSynthList.add(s1);
        studentSynthList.add(s3);
        studentSynthList.add(s4);
        studentSynthList.add(s5);
        studentSynthList.add(s6);
        studentSynthList.add(s7);
        studentSynthList.add(s8);
        studentSynthList.add(s9);
        studentSynthList.add(s10);
        return studentSynthList;
    }

}
