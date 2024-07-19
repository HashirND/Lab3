package ca.ucalgary.ensf380;

public abstract class Person {
    private static int lastUniqueID = 10000;
    private final int uniqueID;
    private String fullName;
    private String contactNumber;
    private String emailAddress;
    private Address address;

    public Person(String fullName, String contactNumber, String emailAddress, Address address) {
        this.uniqueID = lastUniqueID++;
        this.fullName = fullName;
        this.contactNumber = contactNumber;
        this.emailAddress = emailAddress;
        this.address = address;
    }

    public static String generateNextID(short category) {
        return "ID" + category + "-" + lastUniqueID;
    }

    public boolean addressIsValid() {
        return address != null && address.isValidAddress();
    }

    // the getters and setters
    public String getFullName() { return fullName; }
    public void setFullName(String fullName) { this.fullName = fullName; }

    public String getContactNumber() { return contactNumber; }
    public void setContactNumber(String contactNumber) { this.contactNumber = contactNumber; }

    public String getEmailAddress() { return emailAddress; }
    public void setEmailAddress(String emailAddress) { this.emailAddress = emailAddress; }

    public Address getAddress() { return address; }
    public void setAddress(Address address) { this.address = address; }

    public int getUniqueID() { return uniqueID; }
}
