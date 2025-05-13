class Company {
    public String companyName = "TechCorp";        
    protected int foundedYear = 2000;              
    String location = "Bangalore";                 
    private double revenue = 1_000_000;            

    static {
        System.out.println("Static block of Company executed.");
    }

    
    public void displayInfo() {
        System.out.println("Company: " + companyName);
        System.out.println("Founded: " + foundedYear);
        System.out.println("Location: " + location);
        System.out.println("Revenue: " + revenue);
    }
}

class Employee extends Company {
    static String department = "IT";

    static {
        System.out.println("Static block of Employee executed.");
    }
    static void showDepartment() {
        System.out.println("Department: " + department);
    }

    void showEmployee() {
        System.out.println("Accessing inherited fields:");
        System.out.println("Company Name: " + companyName);
        System.out.println("Founded Year: " + foundedYear);
        System.out.println("Location: " + location);
        // System.out.println("Revenue: " + revenue); //  Error: revenue is private
    }
}

public class Q17 {
    public static void main(String[] args) {
        Employee.showDepartment();       // Static method call
        Employee emp = new Employee();   // Object creation
        emp.showEmployee();              // Inherited access
        emp.displayInfo();               // Parent method
    }
}
