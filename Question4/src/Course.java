import java.util.ArrayList;
import java.util.List;

public class Course {
    private String courseName;
    private List<Textbook> textbooks = new ArrayList<>();
    private List<Instructor> instructors = new ArrayList<>();

    Course(String courseName) { this.courseName = courseName; }
    
    // Setters and Getters
    public String getCourseName() { return courseName; }
    public void setCourseNamePublic(String courseName) { this.courseName = courseName; }

    // Aggregation 
    public void addInstructor(Instructor instructor) {
        if (instructor != null) {
            instructors.add(instructor); 
        }
    }

    public void addTextbook(Textbook textbook) {
        if (textbook != null) {
            textbooks.add(textbook); 
        }
    }
    public List<Instructor> getInstructors() { return instructors; }
    public List<Textbook> getTextbooks() { return textbooks; }

    public void Print(){
        System.out.println("Course Name: " + courseName);

        if (instructors.isEmpty()) {
            System.out.println("No instructors assigned.");
        } else {
            //System.out.println("Instructors:");
            for (Instructor instructor : instructors) {
                instructor.print();
            }
        }

        if (textbooks.isEmpty()) {
            System.out.println("No textbooks assigned.");
        } else {
            //System.out.println("Textbooks:");
            for (Textbook textbook : textbooks) {
                textbook.print();
            }
        }
    }
}
