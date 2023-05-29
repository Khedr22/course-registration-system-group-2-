package Backed;

import java.util.ArrayList;

public class Course {

    private String courseName;
    private String courseID;
    private String courseCreditHours;
    ArrayList<Student> students = new ArrayList<Student>();
    Professor professor;

    public Course(String courseName, String courseID, String courseCreditHoures) {
        this.courseName = courseName;
        this.courseID = courseID;
        this.courseCreditHours = courseCreditHoures;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseID() {
        return courseID;
    }

    public void setCourseID(String courseID) {
        this.courseID = courseID;
    }

    public String getCourseCreditHours() {
        return courseCreditHours;
    }

    public void setCourseCreditHours(String courseCreditHoures) {
        this.courseCreditHours = courseCreditHoures;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public void displayData() {
        System.out.println("Course Name : " + courseName
                + "\nCourse ID : " + courseID
                + "\nCourse Credit Hourse : " + courseCreditHours);
        for (Student s : students) {
            s.display();
            System.out.println("\n\n");
        }
    }

    public static void getCourseData(ArrayList<Course> coursesCreated, String courseName) {
        for (Course x : coursesCreated) {
            if (courseName.equals(x.courseName)) {
                x.displayData();
            }
        }
    }

}
