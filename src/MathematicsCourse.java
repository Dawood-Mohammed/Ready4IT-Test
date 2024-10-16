public class MathematicsCourse extends OnCampusCourse{

    public MathematicsCourse(double courseFee, String courseStartTime, String courseEndTime, String courseDescription) {
        super(courseFee, courseStartTime, courseEndTime, courseDescription);
    }

    @Override
    public void printEnrolledStudents() {
        System.out.println("******* Displaying Mathematics Enrolled Students *******");
        super.enrolledStudents.forEach(System.out::println);
    }
}
