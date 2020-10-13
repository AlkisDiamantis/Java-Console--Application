package MyPkg;

import java.time.LocalDateTime;

public class Assignment {

    private String title;
    private String description;
    private LocalDateTime subDateTime;
    private int totalMark;

    public Assignment(String title, String description, LocalDateTime subDateTime, int totalMark) {
        this.title = title;
        this.description = description;
        this.subDateTime = subDateTime;
        this.totalMark = totalMark;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "ASSIGMENT: " + "TITLE: " + title + ", DESCRIPTION: " + description + ", SUBMISION DATE: " + subDateTime + ", TOTAL MARK: " + totalMark + '}';
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getSubDateTime() {
        return subDateTime;
    }

    public void setSubDateTime(LocalDateTime subDateTime) {
        this.subDateTime = subDateTime;
    }

    public int getTotalMark() {
        return totalMark;
    }

    public void setTotalMark(int totalMark) {
        this.totalMark = totalMark;
    }

}
