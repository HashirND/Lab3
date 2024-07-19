package ca.ucalgary.ensf380;

public class Student extends Person {
    private String studentID;
    private Professor academicAdvisor;
    private double gpa;

    public Student(String fullName, String contactNumber, String emailAddress, Address address, String studentID, Professor academicAdvisor, double gpa) {
        super(fullName, contactNumber, emailAddress, address);
        this.studentID = studentID;
        this.academicAdvisor = academicAdvisor;
        this.gpa = gpa;
    }

    public boolean isEligibleForEnrollment() {
        return gpa >= 2.0; // minimum needed condition
    }

    // the getters and setters
    public String getStudentID() { return studentID; }
    public void setStudentID(String studentID) { this.studentID = studentID; }

    public Professor getAcademicAdvisor() { return academicAdvisor; }
    public void setAcademicAdvisor(Professor academicAdvisor) { this.academicAdvisor = academicAdvisor; }

    public double getGpa() { return gpa; }
    public void setGpa(double gpa) { this.gpa = gpa; }
}
