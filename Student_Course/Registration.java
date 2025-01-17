package Student_Course;

import java.util.*;
public class Registration {
    private Course_Database course_Database;
    private Student_Database student_Database;

    public Registration()
    {
        course_Database = new Course_Database();
        student_Database = new Student_Database();
        fameCourse();
        fameStudent();
    }

    private void fameCourse()
    {
        course_Database.addCourse(new Course("CS101", "Introduction to CS", "Basics of computer science and programming.", 100, "Mon/Wed/Fri 9-10AM"));
        course_Database.addCourse(new Course("MAT202", "Linear Algebra", "Vector Space.", 30, "Wed/Fri 10AM-12PM"));
    }

    private void fameStudent()
    {
        student_Database.addStudent(new Student(001, "Alex345", "47522"));
        student_Database.addStudent(new Student(002, "Bisas432", "54522542"));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Registration obj = new Registration();
        while (true)
        {
            System.out.println("\n 1. List of Courses \n 2. Register Course \n 3. Drop a course \n 4. Exit");
            System.out.print("Please Choose Your Option : ");
            int a = sc.nextInt();
            switch (a) {
            case 1:
                obj.listCourses();
                break;
            case 2:
                obj.regCourse(sc);
                break;
            case 3:
                obj.Drop(sc);
                break;
            case 4:
                System.out.println("Exiting....");
                return;
            default:
                System.out.println("Invalid Choice.Please Try Again!");
            }
        }
    }

    private void listCourses()
    {
        Course_Listing course_Listing = new Course_Listing();
        course_Listing.listCourses(course_Database);
    }

    private void regCourse(Scanner sc)
    {
        System.out.print("Dear User, Please Enter the Student ID : ");
        int ID = sc.nextInt();
        sc.nextLine();
        Student student = student_Database.findStudentByID(ID);
        if(student == null)
        {
            System.out.println("Stdent data is not found.");
            return;
        }
        System.out.print("Dear User, Please Enter the Course Code : ");
        String courseCode = sc.nextLine();

        Course course = course_Database.findCourseByCode(courseCode);
        if(course == null || course.getcapacity() <= 0)
        {
            System.out.println("Course not found.");
            return;
        }
        student.regCou(courseCode);
        course.setcapacity(course.getcapacity() - 1);
        System.out.println("Course is Registered.");
    }

    private void Drop(Scanner sc)
    {
        System.out.print("Dear User, Please Enter the Student ID : ");
        int ID = sc.nextInt();
        sc.nextLine();
        Student student = student_Database.findStudentByID(ID);
        if(student == null)
        {
            System.out.println("Student data is not found!");
            return;
        }

        System.out.print("Dear User, Please Enter the Course Code : ");
        String courseCode = sc.nextLine();

        Course course = course_Database.findCourseByCode(courseCode);

        if(course != null)
        {
            Course_Removal course_Removal = new Course_Removal();
            course_Removal.drop(student, course);
        }
    }
}
