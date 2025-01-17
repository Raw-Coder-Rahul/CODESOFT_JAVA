package Student_Course;

public class Course_Removal {
    public void drop(Student stu, Course cou)
    {
        if(stu.getCourse().contains(cou.getcourse()))
        {
            stu.drop(cou.getcourse());
            cou.setcapacity(cou.getcapacity() + 1);
            System.out.println("Drop the course successful.");
        }
        else{
            System.out.println("You not alligned for this course.");
        }
    }
}
