package ca.ucalgary.ensf380;

public class UniversityMain {
    public static void main(String[] args) {
        Address profAddress = new Address("2712 Brentwood Blvd", "Calgary", "AB", "T2L 1J4", "Canada");
        Professor prof = new Professor("Dr. Hashir Naved", "587-839-2506", "hashir.naved@ucalgary.ca", profAddress, "ENSF337", 100000.00);

        Address studentAddress = new Address("4135 Aria", "Calgary", "AB", "T2K 2H4", "Canada");
        Student student = new Student("Sami Khaled", "587-555-555", "sami.khaled@ucalgary.ca", studentAddress, "ABC123", prof, 3.5);

        System.out.println("Professor Information:");
        System.out.println("Full Name: " + prof.getFullName());
        System.out.println("Faculty ID: " + prof.getFacultyID());
        System.out.println("Salary: $" + prof.getAnnualSalary());
        System.out.println("Home Address: " + prof.getAddress().toFormattedString());
        System.out.println();

        System.out.println("Student Details:");
        System.out.println("Full Name: " + student.getFullName());
        System.out.println("Student ID: " + student.getStudentID());
        System.out.println("Academic Contact: " + student.getAcademicAdvisor().getFullName());
        System.out.println("Grade Point Average: " + student.getGpa());
        System.out.println("Home Address: " + student.getAddress().toFormattedString());
    }
}
