package _11_2;

import java.util.Date;

public class Faculty extends Employee{

    public String officeHours;
    public String rank;

    public Faculty(String name, String address, String phoneNumber, String emailAddress, String office, Double salary, Date dateHired, String officeHours, String rank) {
        super(name, address, phoneNumber, emailAddress, office, salary, dateHired);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    public Faculty() {
    }

    @Override
    public String toString() {
        return "Faculty " + "is called " + super.name;
    }
}
