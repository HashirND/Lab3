package ca.ucalgary.ensf380;

public class Professor extends Person {
    private String facultyID;
    private double annualSalary;

    public Professor(String fullName, String contactNumber, String emailAddress, Address address, String facultyID, double annualSalary) {
        super(fullName, contactNumber, emailAddress, address);
        this.facultyID = facultyID;
        this.annualSalary = annualSalary;
    }

    // the getters and setters
    public String getFacultyID() { return facultyID; }
    public void setFacultyID(String facultyID) { this.facultyID = facultyID; }

    public double getAnnualSalary() { return annualSalary; }
    public void setAnnualSalary(double annualSalary) { this.annualSalary = annualSalary; }
}
