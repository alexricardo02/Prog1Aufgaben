package _11_2;

import java.util.Date;

public class Employee extends Person{

    String office;
    Double salary;
    Date dateHired;

    public Employee(String name, String address, String phoneNumber, String emailAddress, String office, Double salary, Date dateHired) {
        super(name, address, phoneNumber, emailAddress);
        this.office = office;
        this.salary = salary;
        this.dateHired = dateHired;
    }

    public Employee(){
    }

    @Override
    public String toString() {
        return "Employee " + "is called " + super.name;
    }

}
