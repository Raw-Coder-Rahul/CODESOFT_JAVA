package Student_Course;

public class Course {
    private String course_code;
    private String title;
    private String description;
    private int capacity;
    private String schedule;
    public Course(String c,String t,String des,int cap,String sc)
    {
        course_code = c;
        title = t;
        description = des;
        capacity = cap;
        schedule = sc;
    }    
    public String getcourse(){return this.course_code;}
    public String gettitle(){return this.title;}
    public String getdescription(){return this.description;}
    public int getcapacity(){return this.capacity;}
    public String getschedule(){return this.schedule;}

    public String setcourse(){return this.course_code;}
    public String settitle(){return this.title;}
    public String setdescription(){return this.description;}
    public void setcapacity(int capacity){this.capacity = capacity;}
    public String setschedule(){return this.schedule;}
    
    public String toString()
    {
        return "Course Code : "+course_code +"\n Title : "+ title +"\n Description : "+ description +" \n Capacity : "+ capacity +" \n Schedule : "+ schedule;
    }
}
