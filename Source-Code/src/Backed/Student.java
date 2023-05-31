package Backed;

import java.util.ArrayList;

public class Student extends User {

    public Student(String name, String id, String Address, String Gender, String email, String password, int phonenumber) {
        super(name, id, Address, Gender, email, password, phonenumber);
    }

    ArrayList<Course> courses = new ArrayList<Course>();

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }

    public void registerCourse(ArrayList<Course> coursesCreated, String courseName, Student s) {

        for (Course c : coursesCreated) {
            if (courseName.equals(c.getCourseName())) {
                c.getStudents().add(s);
                courses.add(c);
            }
        }

    }
    public void seeRegisteredCourses(){
        for(Course x:courses){
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
                + "\nPhone Number : " + getPhonenumber()+"\n");
        for (Course x:courses){
            System.out.println(x.getCourseName()+"\n");
        }

    }

}
