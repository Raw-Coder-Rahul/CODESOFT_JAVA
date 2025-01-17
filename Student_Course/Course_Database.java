package Student_Course;

import java.util.*;
import java.util.ArrayList;
class Course_Database {
    private List<Course> courses;

    public Course_Database()
    {
        courses = new ArrayList<>();
    }

    public void addCourse(Course course)
    {
        courses.add(course);
    }

    public List<Course> getCourses(){return courses;}

    public Course findCourseByCode(String courseCode)
    {
        for(Course course : courses)
        {
            if(course.getcourse().equals(courseCode))
            {
                return course;
            }
        }
        return null;
    }
}
