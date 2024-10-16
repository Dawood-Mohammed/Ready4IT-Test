public class MathematicsCourse extends OnCampusCourse{

    public MathematicsCourse(double courseFee, String courseStartTime, String courseEndTime, String courseDescription) {
        super(courseFee, courseStartTime, courseEndTime, courseDescription);
    }

    @Override
    public void printEnrolledStudents() {
        System.out.println("******* Displaying Mathematics Enrolled Students *******");
        super.enrolledStudents.forEach(System.out::println);
    }

    @Override
    public void unenrollStudent(Student student) {
        System.out.println("Un-enrolling student: "+student+" from Mathematics Course");
        this.enrolledStudents.remove(student);
    }
}
