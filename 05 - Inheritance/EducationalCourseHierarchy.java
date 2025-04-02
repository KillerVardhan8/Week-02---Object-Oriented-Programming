import java.util.*;

class Course{
    private String courseName;
    private double duration;

    public Course(String courseName, double duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    public void displayDetails(){
        System.out.println("Course Name : "+courseName);
        System.out.println(duration+" months Duration ");
    }
}

class OnlineCourse extends Course{
    private String Platform;
    private boolean isRecorded;

    public OnlineCourse(String courseName, double duration, String platform, boolean isRecorded) {
        super(courseName, duration);
        Platform = platform;
        this.isRecorded = isRecorded;
    }

    @Override
    public void displayDetails() {
        System.out.println("Online Course : ");
        super.displayDetails();
        System.out.println("Platform : "+Platform);
        if (isRecorded){
            System.out.println("Course is Recorded");}
        else{
            System.out.println("Course is not Recorded");
        }
    }
}

class PaidOnlineCourse extends Course{
    private double fee;
    private double Discount;

    public PaidOnlineCourse(String courseName, double duration, double fee, double discount) {
        super(courseName, duration);
        this.fee = fee;
        Discount = discount;
    }

    @Override
    public void displayDetails() {
        System.out.println("Paid Online Course :");
        super.displayDetails();
        System.out.println("Fee : "+fee);
        System.out.println("Discount : "+Discount);
    }
}
public class EducationalCourseHierarchy {
    public static void main(String[] args) {
        ArrayList<Course> courselist=new ArrayList<>();

        Course course1=new Course("Udemy with python",6);
        PaidOnlineCourse paidOnlineCourse1=new PaidOnlineCourse("Program with TensorFlow",10,5000,500);
        OnlineCourse onlineCourse1=new OnlineCourse("Analytics with Python",6,"Udemy",true);

        courselist.add(course1);
        courselist.add(onlineCourse1);
        courselist.add(paidOnlineCourse1);

        for(Course course:courselist){
            course.displayDetails();
            System.out.println();
        }
    }
}
