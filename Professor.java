package Backed;

import java.util.ArrayList;

public class Professor extends User {

    ArrayList<Course> courses = new ArrayList<Course>();

    public Professor(String name, String id, String Address, String Gender, String email, String password, int phonenumber) {
        super(name, id, Address, Gender, email, password, phonenumber);
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }

    public void createCourse(ArrayList<Course> coursesCreated, String courseName, String courseID, String courseCreditHours) {
        Course c = new Course(courseName, courseID, courseCreditHours);
        coursesCreated.add(c);
    }

    public void addCourseToTeach(Professor p, ArrayList<Course> coursesCreated, String courseName) {
        for (Course x : coursesCreated) {
            if (courseName.equals(x.getCourseName()) && x.getProfessor() == null) {
                courses.add(x);
                x.setProfessor(p);
                System.out.println("The Course Has Been Added To The Courses You Teach");
                break;
            }
        }
    }

    public void removeCourseFromProfessor(String courseName) {
        for (Course x : courses) {
            if (courseName.equals(x.getCourseName())) {
                courses.remove(x);
                System.out.println("The Course Has Been Removed!");
                break;
            }
        }
    }

    public void getDataOfAllCourses(ArrayList<Course> coursesCreated) {
        for (Course x : coursesCreated) {
            x.displayData();
        }
    }

    public void display() {
        System.out.println("Username : " + getName()
                + "\nID : " + getId()
                + "\nAddress : " + getAddress()
                + "\nGender : " + getGender()
                + "\nEmail : " + getEmail()
                + "\nPassword : " + getPassword()
                + "\nPhone Number : " + getPhonenumber());
        for (Course x : courses) {
            System.out.println("Course Name : " + x.getCourseName()
                    + "\nCourse ID : " + x.getCourseID()
                    + "\nCourse Credit Hours : " + x.getCourseCreditHours()
                    + "\n\n");
        }
    }

}
