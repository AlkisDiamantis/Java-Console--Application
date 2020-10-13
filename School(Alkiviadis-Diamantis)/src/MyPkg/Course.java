package MyPkg;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Objects;

public class Course {

    private String title;
    private String stream;
    private String type;
    private LocalDate start_date;
    private LocalDate end_date;
    private ArrayList<Student> courseStudentsList = new ArrayList();
    private ArrayList<Trainer> courseTrainersList = new ArrayList();
    private ArrayList<Assignment> courseAssigmentsList = new ArrayList();

    public ArrayList<Assignment> getCourseAssigmentsList() {
        return courseAssigmentsList;
    }

    public ArrayList<Student> getCourseStudentsList() {
        return courseStudentsList;
    }

    public ArrayList<Trainer> getCourseTrainersList() {
        return courseTrainersList;

    }

    public void addCourseTrainersList(Trainer trainer) {
        courseTrainersList.add(trainer);
    }

    public void addCourseAssigmentsList(Assignment assignment) {
        courseAssigmentsList.add(assignment);
    }

    public void addCourseStudentsList(Student student) {

        courseStudentsList.add(student);

    }

    public Course(String title, String stream, String type, LocalDate start_date, LocalDate end_date) {
        this.title = title;
        this.stream = stream;
        this.type = type;
        this.start_date = start_date;
        this.end_date = end_date;
    }

    public Course(String title, String stream, String type, LocalDate start_date, LocalDate end_date, ArrayList<Assignment> courseAssigmentsList) {
        this.title = title;
        this.stream = stream;
        this.type = type;
        this.start_date = start_date;
        this.end_date = end_date;
        this.courseAssigmentsList = courseAssigmentsList;
    }

    public Course(String title, String stream, String type, LocalDate start_date, LocalDate end_date, ArrayList<Assignment> courseAssigmentsList, ArrayList<Student> courseStudentsList) {
        this.title = title;
        this.stream = stream;
        this.type = type;
        this.start_date = start_date;
        this.end_date = end_date;
        this.courseAssigmentsList = courseAssigmentsList;
        this.courseStudentsList = courseStudentsList;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStream() {
        return stream;
    }

    public void setStream(String stream) {
        this.stream = stream;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public LocalDate getStart_date() {
        return start_date;
    }

    public void setStart_date(LocalDate start_date) {
        this.start_date = start_date;
    }

    public LocalDate getEnd_date() {
        return end_date;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Course other = (Course) obj;
        if (!Objects.equals(this.title, other.title)) {
            return false;
        }
        if (!Objects.equals(this.stream, other.stream)) {
            return false;
        }
        if (!Objects.equals(this.type, other.type)) {
            return false;
        }
        if (!Objects.equals(this.start_date, other.start_date)) {
            return false;
        }
        if (!Objects.equals(this.end_date, other.end_date)) {
            return false;
        }
        if (!Objects.equals(this.courseStudentsList, other.courseStudentsList)) {
            return false;
        }
        if (!Objects.equals(this.courseTrainersList, other.courseTrainersList)) {
            return false;
        }
        if (!Objects.equals(this.courseAssigmentsList, other.courseAssigmentsList)) {
            return false;
        }
        return true;
    }

    public void setEnd_date(LocalDate end_date) {
        this.end_date = end_date;
    }

    @Override
    public String toString() {
        return "COURSE: TITLE: " + title + ", STREAM: " + stream + ", TYPE: " + type + ", START DATE: " + start_date + ", END DATE: " + end_date + '}';
    }

}
