package Student_Course;

import java.util.*;

public class Student {
    private int Student_ID;
    private String name;
    private List<String> Registered_Courses;
    public Student(int id,String n,String reg)
    {
        Student_ID = id;
        name = n;
        Registered_Courses = new ArrayList<>();
    }    
    public int getId(){return this.Student_ID;}
    public String getname(){return this.name;}
    public List<String> getCourse(){return Registered_Courses;}

    public void regCou(String coucode)
    {
        Registered_Courses.add(coucode);
    }

    public void drop(String code)
    {
        Registered_Courses.remove(code);
    }
}