package MyPkg;

import java.time.LocalDate;
import java.util.ArrayList;

public class Student {

    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private int tuitionFees;

    private ArrayList<Course> studentCoursesList = new ArrayList();
    private ArrayList<Assignment> studentAssignmentsList = new ArrayList();

    public void setStudentCoursesList(ArrayList<Course> studentCoursesList) {
        this.studentCoursesList = studentCoursesList;
    }

    public void setStudentAssignmentsList(ArrayList<Assignment> studentAssignmentsList) {
        this.studentAssignmentsList = studentAssignmentsList;
    }

    public Student(String firstName, String lastName, LocalDate dateOfBirth, int tuitionFees, ArrayList<Assignment> studentAssignmentsList, ArrayList<Course> studentCoursesList) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.tuitionFees = tuitionFees;
        this.studentCoursesList = studentCoursesList;
        this.studentAssignmentsList = studentAssignmentsList;

    }

    public Student(String firstName, String lastName, LocalDate dateOfBirth, int tuitionFees, ArrayList<Course> studentCoursesList) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.tuitionFees = tuitionFees;
        this.studentCoursesList = studentCoursesList;

    }

    public void addStudentCoursesList(Course course) {
        studentCoursesList.add(course);
    }

    public void addStudentAssignmentsList(Assignment assignment) {
        studentAssignmentsList.add(assignment);
    }

    public ArrayList<Course> getStudentCoursesList() {
        return studentCoursesList;
    }

    public ArrayList<Assignment> getStudentAssignmentsList() {
        return studentAssignmentsList;
    }

    public Student(String firstName, String lastName, LocalDate dateOfBirth, int tuitionFees) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.tuitionFees = tuitionFees;

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getTuitionFees() {
        return tuitionFees;
    }

    public void setTuitionFees(int tuitionFees) {
        this.tuitionFees = tuitionFees;
    }

    @Override
    public String toString() {
        return "STUDENT: FIRST NAME: " + firstName + ", LAST NAME: " + lastName + ", DATE OF BIRTH: " + dateOfBirth + ", TUITION FEES: " + tuitionFees + '}';
    }

}
