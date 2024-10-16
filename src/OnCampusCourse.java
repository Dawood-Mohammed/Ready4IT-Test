import java.util.HashSet;
import java.util.Set;

public abstract class OnCampusCourse implements Course{
    protected Set<Student> enrolledStudents;
    private double courseFee;
    private String courseStartTime;
    private String courseEndTime;
    private String courseDescription;
    private CourseType courseType;
    public OnCampusCourse(double courseFee, String courseStartTime, String courseEndTime, String courseDescription){
        this.courseFee = courseFee;
        this.courseStartTime = courseStartTime;
        this.courseEndTime = courseEndTime;
        this.courseDescription = courseDescription;
        this.enrolledStudents = new HashSet<>();
        this.courseType = CourseType.ON_CAMPUS;
    }
    @Override
    public double getCourseFee() {
        return this.courseFee;
    }

    @Override
    public String getCourseStartTime() {
        return this.courseStartTime;
    }

    @Override
    public String getCourseEndTime() {
        return this.courseEndTime;
    }

    @Override
    public void printCourseDescription() {
        System.out.println("Course Descriptin: "+courseDescription);
    }

    @Override
    public void enrollStudent(Student student) {
        this.enrolledStudents.add(student);
    }

    @Override
    public void unenrollStudent(Student student) {
        System.out.println("Un-enrolling student: "+student);
        this.enrolledStudents.remove(student);
    }
}
