package _11_2;

public class Student extends Person{

    public static final String FRESHMAN = "Freshman";
    public static final String SOPHOMORE = "Sophomore";
    public static final String JUNIOR = "Junior";
    public static final String SENIOR = "Senior";

    private String status;

    public void setStatus(String status) {
        if (status.equals(FRESHMAN) || status.equals(SOPHOMORE) ||
                status.equals(JUNIOR) || status.equals(SENIOR)) {
            this.status = status;
        } else {
            throw new IllegalArgumentException("Invalid status: " + status);
        }
    }

    public Student(String name, String address, String phoneNumber, String emailAddress, String status) {
        super(name, address, phoneNumber, emailAddress);
        this.status = status;
    }

    public Student() {
    }

    @Override
    public String toString() {
        return "Student " + "is called " + super.name;
    }
}
