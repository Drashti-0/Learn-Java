class Employee {
    // Properties
    int salary;
    String name;

    // Method to get salary (returning int)
    public int getSalary() {
        return salary;
    }

    // Method to get name (returning String)
    public String getName() {
        return name;
    }

    // Method to change name (setting String)
    public void setName(String newName) {
        name = newName;
    }
}

public class basic_oop{
    public static void main(String[] args) {
        // Object creation
        Employee emp = new Employee();

        // Setting values
        emp.name = "Rahul";
        emp.salary = 50000;

        // Testing the methods
        System.out.println("Employee Name: " + emp.getName());
        System.out.println("Employee Salary: " + emp.getSalary());

        // Changing name using setName method
        emp.setName("Amit");
        System.out.println("Updated Name: " + emp.getName());
    }
}