package test_package;

import _11_2.*;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.assertEquals;

public class PersonTest {

    @Test
    public void testPersonToString() {
        Person person = new Person("John Doe", "123 Main St", "555-1234", "john@example.com");
        assertEquals("Person: John Doe", person.toString());
    }

    @Test
    public void testStudentToString() {
        Student student = new Student("Alice Smith", "456 Elm St", "555-5678", "alice@example.com", Student.FRESHMAN);
        assertEquals("Student: Alice Smith, Status: Freshman", student.toString());
    }

    @Test
    public void testEmployeeToString() {
        Date hireDate = new Date();
        Employee employee = new Employee("Bob Brown", "789 Oak St", "555-9101", "bob@example.com", "A101", 50000.0, hireDate);
        assertEquals("Employee: Bob Brown, Office: A101, Salary: 50000.0", employee.toString());
    }

    @Test
    public void testFacultyToString() {
        Date hireDate = new Date();
        Faculty faculty = new Faculty("Dr. Carol White", "101 Pine St", "555-1122", "carol@example.com", "B202", 70000.0, hireDate, "9am-12pm", "Professor");
        assertEquals("Faculty: Dr. Carol White, Rank: Professor, Office Hours: 9am-12pm", faculty.toString());
    }

    @Test
    public void testStaffToString() {
        Date hireDate = new Date();
        Staff staff = new Staff("Eve Green", "202 Birch St", "555-3344", "eve@example.com", "C303", 40000.0, hireDate, "Secretary");
        assertEquals("Staff: Eve Green, Title: Secretary", staff.toString());
    }
}
