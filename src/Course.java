public interface Course {
    double getCourseFee();
    String getCourseStartTime();
    String getCourseEndTime();
    void printCourseDescription();
    void printEnrolledStudents();
    void enrollStudent(Student student);
    void unenrollStudent(Student student);
}
