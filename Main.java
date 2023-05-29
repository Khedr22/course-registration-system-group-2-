package Backed;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Professor> professorAccounts = new ArrayList<>();
        ArrayList<Student> studentAccounts = new ArrayList<>();
        ArrayList<Course> coursesCreated = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1:Professor\nEnter 2:Student");
        int ProfOrStud = sc.nextInt();
        //To Log In Or Register
        while (ProfOrStud == 1 || ProfOrStud == 2) {
            switch (ProfOrStud) {
                //If He is A Professor
                case 1:
                    System.out.println("Enter 1:TO Register\nEnter 2:TO Log In\nEnter 0:TO Exit");
                    int logOrReg = sc.nextInt();
                    while (logOrReg == 1 || logOrReg == 2) {
                        switch (logOrReg) {
                            //Register
                            case 1:
                                System.out.println("Enter Username");
                                String username = sc.next();
                                System.out.println("Enter ID");
                                String id = sc.next();

                                System.out.println("Enter Address");
                                String address = sc.next();

                                System.out.println("Enter Gender");
                                String gender = sc.next();

                                System.out.println("Enter Email");
                                String email = sc.next();

                                System.out.println("Enter Password");
                                String password = sc.next();

                                System.out.println("Enter Phone Number");
                                int phoneNumber = sc.nextInt();

                                Professor p = new Professor(username, id, address, gender, email, password, phoneNumber);
                                professorAccounts.add(p);
                                //TODO Options
                                System.out.println("Enter 1:Create Course"
                                        + "\nEnter 2:Add Course To Professor's Courses" + "\nEnter 3:To Remove Course From Professor"
                                        + "\nEnter 4:Get Data Of A Course"
                                        + "\nEnter 5:Get Data Of All Rooms");
                                int options = sc.nextInt();
                                optionsOfProfessor(coursesCreated, p, sc, options);
                                break;
                            //Log In
                            case 2:
                                System.out.println("Enter Username");
                                username = sc.next();

                                System.out.println("Enter Password");
                                password = sc.next();

                                for (Professor x : professorAccounts) {
                                    if (username.equals(x.getName()) && password.equals(x.getPassword())) {
                                        System.out.println("Enter 1:Create Course"
                                                + "\nEnter 2:Add Course To Professor's Courses" + "\nEnter 3:To Remove Course From Professor"
                                                + "\nEnter 4:Get Data Of A Course"
                                                + "\nEnter 5:Get Data Of All Rooms");
                                        options = sc.nextInt();
                                        optionsOfProfessor(coursesCreated, x, sc, options);
                                        break;
                                    }
                                }
                                break;

                        }
                        System.out.println("Log In Or Register");
                        logOrReg = sc.nextInt();
                    }
                    break;
                //If He Is A Student
                case 2:
                    System.out.println("Enter 1:TO Register\nEnter 2:TO Log In\nEnter 0:TO Exit");
                    logOrReg = sc.nextInt();
                    while (logOrReg == 1 || logOrReg == 2) {
                        switch (logOrReg) {
                            //Register
                            case 1:
                                System.out.println("Enter Username");
                                String username = sc.next();
                                System.out.println("Enter ID");
                                String id = sc.next();

                                System.out.println("Enter Address");
                                String address = sc.next();

                                System.out.println("Enter Gender");
                                String gender = sc.next();

                                System.out.println("Enter Email");
                                String email = sc.next();

                                System.out.println("Enter Password");
                                String password = sc.next();

                                System.out.println("Enter Phone Number");
                                int phoneNumber = sc.nextInt();

                                Student s = new Student(username, id, address, gender, email, password, phoneNumber);
                                studentAccounts.add(s);
                                System.out.println("Enter 1:TO Register Course");
                                int options = sc.nextInt();
                                optionsOfStudent(sc, coursesCreated, s, options);

                                break;
                            //Log In
                            case 2:
                                System.out.println("Enter Username");
                                username = sc.next();

                                System.out.println("Enter Password");
                                password = sc.next();

                                for (Student x : studentAccounts) {
                                    if (username.equals(x.getName()) && password.equals(x.getPassword())) {

                                        System.out.println("Enter 1:TO Register Course");
                                        options = sc.nextInt();
                                        optionsOfStudent(sc, coursesCreated, x, options);
                                    }
                                }
                                break;

                        }
                        System.out.println("Log In Or Register");
                        logOrReg = sc.nextInt();
                    }
                    break;

            }
            System.out.println("Enter 1:Professor\nEnter 2:Student");
            ProfOrStud = sc.nextInt();

        }

    }

    public static void optionsOfProfessor(ArrayList<Course> coursesCreated, Professor p, Scanner sc, int options) {
        while (options != 0) {
            switch (options) {
                //Create Course
                case 1:
                    System.out.println("Enter Course Name");
                    String courseName = sc.next();

                    System.out.println("Enter Course ID");
                    String courseID = sc.next();

                    System.out.println("Enter Course Credit Hours");
                    String courseCreditHours = sc.next();

                    p.createCourse(coursesCreated, courseName, courseID, courseCreditHours);
                    //add Courses To The Professor's Courses
                    break;
                case 2:
                    System.out.println("Enter Course Name");
                    courseName = sc.next();

                    p.addCourseToTeach(p, coursesCreated, courseName);

                    break;
                case 3:
                    System.out.println("Enter Course Name");
                    courseName = sc.next();

                    p.removeCourseFromProfessor(courseName);
                    break;
                case 4:
                    System.out.println("Enter Course Name");
                    courseName = sc.next();

                    Course.getCourseData(coursesCreated, courseName);
                    break;
                case 5:

                    p.getDataOfAllCourses(coursesCreated);
                    break;
            }
            System.out.println("Enter 1:Create Course"
                    + "\nEnter 2:Add Course To Professor's Courses" + "\nEnter 3:To Remove Course From Professor"
                    + "\nEnter 4:Get Data Of A Course"
                    + "\nEnter 5:Get Data Of All Rooms");
            options = sc.nextInt();
        }
    }

    public static void optionsOfStudent(Scanner sc, ArrayList<Course> coursesCreated, Student s, int options) {
        while (options != 0) {
            switch (options) {

                case 1:
                    System.out.println("Enter Course Name");
                    String courseName = sc.next();

                    s.registerCourse(coursesCreated, courseName, s);

                    break;

            }
            System.out.println("Enter 1:TO Register Course");
            options = sc.nextInt();
        }
    }
}
