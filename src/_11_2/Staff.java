package _11_2;

import java.util.Date;

public class Staff extends Employee{

    public String title;

    public Staff(String name, String address, String phoneNumber, String emailAddress, String office, Double salary, Date dateHired, String title) {
        super(name, address, phoneNumber, emailAddress, office, salary, dateHired);
        this.title = title;
    }

    public Staff() {
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " is called " + super.name;
    }

}
