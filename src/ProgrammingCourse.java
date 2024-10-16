public class ProgrammingCourse extends OnlineCourse{
    public ProgrammingCourse(double courseFee, String courseStartTime, String courseEndTime, String courseDescription) {
        super(courseFee, courseStartTime, courseEndTime, courseDescription);
    }

    @Override
    public void printEnrolledStudents() {
        System.out.println("******* Displaying Programming Enrolled Students *******");
        super.enrolledStudents.forEach(System.out::println);
    }
}
