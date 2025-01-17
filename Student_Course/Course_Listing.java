package Student_Course;

public class Course_Listing {
    public void listCourses(Course_Database courseDatabase)
    {
        System.out.print("Present Course : ");
        for(Course course : courseDatabase.getCourses())
        {
            System.out.println(course);
        }
    }
}
