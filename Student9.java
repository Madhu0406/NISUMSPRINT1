class Student {
    String name;
    String address;
    String section;
    String studentClass;

    
    static String college;
    static int rollNo;

    
    Student(String name, String address, String section, String studentClass, String college, int rollNo) {
        this.name = name;
        this.address = address;
        this.section = section;
        this.studentClass = studentClass;

        
        if (Student.college == null) {
            Student.college = college;
        }

        if (Student.rollNo == 0) {
            Student.rollNo = rollNo;
        }
    }

    
    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Section: " + section);
        System.out.println("Class: " + studentClass);
        System.out.println("College: " + college);
        System.out.println("Roll Number: " + rollNo);
    }
}

public class Student9 {
    public static void main(String[] args) {
        Student student1 = new Student("anish", "123 Street", "A", "10th", "XYZ College", 101);
        Student student2 = new Student("ramu", "Gokarnika", "B", "12th", "XYZ College", 102);
        
        student1.displayInfo();
        System.out.println();
        student2.displayInfo();
    }
}
