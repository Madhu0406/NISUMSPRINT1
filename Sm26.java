import java.util.*;

class Employee implements Comparable<Employee> {
    int id;
    String name, department;
    double salary;

    Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

   
    public int compareTo(Employee other) {
        return this.name.compareToIgnoreCase(other.name);
    }

    public String toString() {
        return id + " | " + name + " | " + department + " | ₹" + salary;
    }
}

public class Sm26 {
    public static void main(String[] args) {
        TreeSet<Employee> employees = new TreeSet<>();

        employees.add(new Employee(101, "sunil", "HR", 40000));
        employees.add(new Employee(102, "amir", "Tech", 60000));
        employees.add(new Employee(103, "Zoya", "Finance", 50000));
        employees.add(new Employee(104, "Salman", "Tech", 45000));

        System.out.println("Employees (Sorted by Name):");
        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }
}
