package Backed;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Professor> professorAccounts = new ArrayList<>();
        ArrayList<Student> studentAccounts = new ArrayList<>();
        ArrayList<Course> coursesCreated = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        System.out.println("<<<<<<<<<<Welcome to ANU Registration System>>>>>>>>>>");
        System.out.println("------------------------------------------------------");
        System.out.println("IF you are a Professor Please Enter < 1 >\nIF you are a Student Please Enter < 2 >");
        System.out.println();
        int ProfOrStud = sc.nextInt();
        //To Log In Or Register
        while (ProfOrStud == 1 || ProfOrStud == 2) {
            switch (ProfOrStud) {
                //If He is A Professor
                case 1:
                System.out.println("================================================================");
                    System.out.println("Enter 1 | TO Register\nEnter 2 | TO Log In\nEnter 0 | TO Exit");
                    System.out.println();
                    int logOrReg = sc.nextInt();
                    System.out.println();
                    while (logOrReg == 1 || logOrReg == 2) {
                        switch (logOrReg) {
                            //Register
                            case 1:
                                System.out.println("Enter Username");
                                System.out.println();
                                String username = sc.next();
                                System.out.println();
                                System.out.println("Enter ID");
                                System.out.println();
                                String id = sc.next();
                                System.out.println();

                                System.out.println("Enter Address");
                                System.out.println();
                                String address = sc.next();
                                System.out.println();

                                System.out.println("Enter Gender");
                                System.out.println();
                                String gender = sc.next();
                                System.out.println();

                                System.out.println("Enter Email");
                                System.out.println();
                                String email = sc.next();
                                System.out.println();

                                System.out.println("Enter Password");
                                System.out.println();
                                String password = sc.next();
                                System.out.println();

                                System.out.println("Enter Phone Number");
                                System.out.println();
                                int phoneNumber = sc.nextInt();
                                System.out.println();

                                Professor p = new Professor(username, id, address, gender, email, password, phoneNumber);
                                professorAccounts.add(p);
                                System.out.println("================================================================");
                                System.out.println("Enter 1 | Create Course"
                                        + "\nEnter 2 | Add Course To Professor's Courses" + "\nEnter 3 | To Remove Course From Professor"
                                        + "\nEnter 4 | Get Data Of A Course"
                                        + "\nEnter 5 | Get Data Of All Courses"
                                        + "\nEnter 6 | Get Data Of A Student"
                                        + "\nEnter 7 | Get Data Of All students"
                                        + "\nEnter 0 | To Exit");
                                int options = sc.nextInt();
                                System.out.println();
                                optionsOfProfessor(coursesCreated, p, sc, options, studentAccounts);
                                break;
                            //Log In
                            case 2:
                                System.out.println("Enter Username");
                                System.out.println();
                                username = sc.next();
                                System.out.println();

                                System.out.println("Enter Password");
                                System.out.println();
                                password = sc.next();
                                System.out.println();

                                for (Professor x : professorAccounts) {
                                    if (username.equals(x.getName()) && password.equals(x.getPassword())) {
                                        System.out.println("================================================================");
                                        System.out.println("Enter 1 | Create Course"
                                                + "\nEnter 2 | Add Course To Professor's Courses" + "\nEnter 3 | To Remove Course From Professor"
                                                + "\nEnter 4 | Get Data Of A Course"
                                                + "\nEnter 5 | Get Data Of All Courses" +
                                                "\nEnter 6 | Get Data Of A Student" +
                                                "\nEnter 7 | Get Data Of All students" +
                                                "\nEnter 0 | To Exit");
                                        options = sc.nextInt();
                                        System.out.println();
                                        optionsOfProfessor(coursesCreated, x, sc, options, studentAccounts);
                                        break;
                                    }
                                }
                                break;

                        }
                        System.out.println("Press 1 to Register OR press 2 to Login OR press 0 to Exit ");
                        System.out.println();
                        logOrReg = sc.nextInt();
                        System.out.println();
                    }
                    break;
                //If He Is A Student
                case 2:
                    System.out.println("Enter 1 | TO Register\nEnter 2 | TO Log In\nEnter 0 | TO Exit");
                    logOrReg = sc.nextInt();
                    while (logOrReg == 1 || logOrReg == 2) {
                        switch (logOrReg) {
                            //Register
                            case 1:
                                System.out.println("Enter Username");
                                System.out.println();
                                String username = sc.next();
                                System.out.println();
                                System.out.println("Enter ID");
                                System.out.println();
                                String id = sc.next();
                                System.out.println();

                                System.out.println("Enter Address");
                                System.out.println();
                                String address = sc.next();
                                System.out.println();

                                System.out.println("Enter Gender");
                                System.out.println();
                                String gender = sc.next();
                                System.out.println();

                                System.out.println("Enter Email");
                                System.out.println();
                                String email = sc.next();
                                System.out.println();

                                System.out.println("Enter Password");
                                System.out.println();
                                String password = sc.next();
                                System.out.println();

                                System.out.println("Enter Phone Number");
                                System.out.println();
                                int phoneNumber = sc.nextInt();
                                System.out.println();

                                Student s = new Student(username, id, address, gender, email, password, phoneNumber);
                                studentAccounts.add(s);
                                System.out.println("================================================================");
                                System.out.println("Enter 1 | TO Register Course" +
                                        "\nEnter 2 | TO Get Data of Registered Courses"+
                                        "\nEnter 0 | To Exit");
                                int options = sc.nextInt();
                                System.out.println();
                                optionsOfStudent(sc, coursesCreated, s, options);

                                break;
                            //Log In
                            case 2:
                                System.out.println("Enter Username");
                                System.out.println();
                                username = sc.next();
                                System.out.println();

                                System.out.println("Enter Password");
                                System.out.println();
                                password = sc.next();
                                System.out.println();

                                for (Student x : studentAccounts) {
                                    if (username.equals(x.getName()) && password.equals(x.getPassword())) {
                                        System.out.println("================================================================");
                                        System.out.println("Enter 1 | TO Register Course" +
                                                "\nEnter 2 | TO Get Data of Registered Courses"+
                                                "\nEnter 0 | To Exit");
                                        options = sc.nextInt();
                                        System.out.println();
                                        optionsOfStudent(sc, coursesCreated, x, options);
                                    }
                                }
                                break;

                        }
                        System.out.println("================================================================");
                        System.out.println("Press 1 to Register OR press 2 to Login OR press 0 to Exit");
                        logOrReg = sc.nextInt();
                        System.out.println();
                    }
                    break;

            }
            System.out.println("Enter 1 | Professor\nEnter 2 | Student");
            ProfOrStud = sc.nextInt();
            System.out.println();

        }

    }

    public static void optionsOfProfessor(ArrayList<Course> coursesCreated, Professor p, Scanner sc, int options, ArrayList<Student> studentAccounts) {
        while (options != 0) {
            switch (options) {
                //Create Course
                case 1:
                    System.out.println("Enter Course Name");
                    System.out.println();
                    String courseName = sc.next();
                    System.out.println();

                    System.out.println("Enter Course ID");
                    System.out.println();
                    String courseID = sc.next();
                    System.out.println();

                    System.out.println("Enter Course Credit Hours");
                    System.out.println();
                    String courseCreditHours = sc.next();
                    System.out.println();

                    p.createCourse(coursesCreated, courseName, courseID, courseCreditHours);
                    //add Courses To The Professor's Courses
                    break;
                case 2:
                    System.out.println("Enter Course Name");
                    courseName = sc.next();
                    System.out.println();

                    p.addCourseToTeach(p, coursesCreated, courseName);

                    break;
                case 3:
                    System.out.println("Enter Course Name");
                    courseName = sc.next();
                    System.out.println();

                    p.removeCourseFromProfessor(courseName);
                    break;
                case 4:
                    System.out.println("Enter Course Name");
                    courseName = sc.next();
                    System.out.println();

                    Course.getCourseData(coursesCreated, courseName);
                    break;
                case 5:

                    p.getDataOfAllCourses(coursesCreated);
                    break;
                case 6:
                    System.out.println("Enter Student Name");
                    String studentName = sc.next();
                    System.out.println();

                    p.getDataStudent(studentName, studentAccounts);
                    break;
                case 7:
                    p.AllStudents(studentAccounts);
                    break;
            }
            System.out.println("================================================================");
            System.out.println("Enter 1 | Create Course"
                    + "\nEnter 2 | Add Course To Professor's Courses" + "\nEnter 3 | To Remove Course From Professor"
                    + "\nEnter 4 | Get Data Of A Course"
                    + "\nEnter 5 | Get Data Of All Courses"
                    + "\nEnter 6 | Get Data Of Student"
                    + "\nEnter 7 | Get Data Of All students"
                    + "\nEnter 0 | To Exit");
            options = sc.nextInt();
            System.out.println();
        }
    }

    public static void optionsOfStudent(Scanner sc, ArrayList<Course> coursesCreated, Student s, int options) {
        while (options != 0) {
            switch (options) {

                case 1:
                    for (Course x : coursesCreated) {
                        x.displayData();
                    }
                    try {
                        System.out.println("Enter Course Name");
                        String courseName = sc.next();
                        System.out.println();

                        s.registerCourse(coursesCreated, courseName, s);
                    }catch (InputMismatchException e){
                        System.out.println("Wrong answer");
                    }
                case 2:
                    s.seeRegisteredCourses();
                    break;

            }
            System.out.println("================================================================");
            System.out.println("Enter 1 | TO Register Course" +
                    "\nEnter 2 | TO Get Data of Registered Courses"+
                    "\nEnter 0 | To Exit");
            options = sc.nextInt();
            System.out.println();
        }
    }
}
