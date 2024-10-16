public class Main {
    public static void main(String[] args) {
        Student jeremie = new Student("00", "Jeremie", 25);
        Student wafi = new Student("11", "Wafi", 28);
        Student mauwa = new Student("22", "Mauwa", 23);
        Student elshazli = new Student("33", "Elshazli", 29);
        Student dawood = new Student("44", "Dawood", 26);
        Student prince = new Student("55", "Prince", 23);
        Student alpha = new Student("66", "Alpha", 27);
        Student melissa = new Student("77", "Melissa", 21);
        Student hana = new Student("88", "Hana", 29);
        Student jean = new Student("99", "Jean", 24);
        Course programming = new ProgrammingCourse(100, "11 Oct, 2025", "19 Dec, 2025", "a java programming course to teach fundamentals of the language");
        Course math = new MathematicsCourse(200, "11 Jan, 2025", "19 Mar, 2025", "a mathematical course that covers basic and intermediate math");
        programming.enrollStudent(jeremie);
        programming.enrollStudent(melissa);
        programming.enrollStudent(alpha);
        programming.enrollStudent(wafi);
        programming.enrollStudent(prince);
        math.enrollStudent(dawood);
        math.enrollStudent(mauwa);
        math.enrollStudent(hana);
        math.enrollStudent(jean);
        math.enrollStudent(elshazli);
        programming.printEnrolledStudents();
        programming.printCourseDescription();
        System.out.println("Programming Course Fees: "+programming.getCourseFee());
        System.out.println("Programming Course Start Time: "+programming.getCourseStartTime());
        System.out.println("Programming Course End Time: "+programming.getCourseStartTime());
        programming.unenrollStudent(alpha);
        programming.printEnrolledStudents();

        System.out.println();
        math.printEnrolledStudents();
        math.printCourseDescription();
        System.out.println("Programming Course Fees: "+math.getCourseFee());
        System.out.println("Programming Course Start Time: "+math.getCourseStartTime());
        System.out.println("Programming Course End Time: "+math.getCourseStartTime());
        math.unenrollStudent(dawood);
        math.printEnrolledStudents();
    }
}