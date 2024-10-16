public class ProgrammingCourse extends OnlineCourse{
    public ProgrammingCourse(double courseFee, String courseStartTime, String courseEndTime, String courseDescription) {
        super(courseFee, courseStartTime, courseEndTime, courseDescription);
    }

    @Override
    public void printEnrolledStudents() {
        System.out.println("******* Displaying Programming Enrolled Students *******");
        super.enrolledStudents.forEach(System.out::println);
    }

    @Override
    public void unenrollStudent(Student student) {
        System.out.println("Un-enrolling Student: "+student+" from Programming Course");
        this.enrolledStudents.remove(student);
    }
}
