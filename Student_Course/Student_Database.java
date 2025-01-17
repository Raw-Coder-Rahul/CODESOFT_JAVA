package Student_Course;

import java.util.*;

public class Student_Database {
    private List<Student> students;
    
    public Student_Database()
    {
        students = new ArrayList<>();
    }

    public void addStudent(Student student)
    {
        students.add(student);
    }

    public Student findStudentByID(int Student_ID)
    {
        for(Student student : students)
        {
            if(student.getId() == Student_ID)
            {
                return student;
            }
        }
        return null;
    }
}
