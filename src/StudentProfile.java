public class StudentProfile {
    String firstName;
    String lastName;
    String major;
    double gpa;
    int expectedYearToGraduate;

    public StudentProfile(String firstName, String lastName, int expectedYearToGraduate, double gpa, String major) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.major = major;
        this.gpa = gpa;
        this.expectedYearToGraduate = expectedYearToGraduate;
    }

    public void incrementExpectedGraduationYear() {
        this.expectedYearToGraduate++;
    }

}
