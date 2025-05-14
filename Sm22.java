import java.util.*;

class Student {
    int id;
    String name;
    String grade;

    Student(int id, String name, String grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Grade: " + grade;
    }
}

public class StudentManagement {
    static ArrayList<Student> students = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    static void addStudent() {
        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Grade: ");
        String grade = sc.nextLine();

        students.add(new Student(id, name, grade));
        System.out.println("Student added.\n");
    }

    static void removeStudent() {
        System.out.print("Enter ID to remove: ");
        int id = sc.nextInt();
        sc.nextLine();
        boolean removed = students.removeIf(s -> s.id == id);
        System.out.println(removed ? "Student removed.\n" : "Student not found.\n");
    }

    static void searchStudent() {
        System.out.print("Enter ID to search: ");
        int id = sc.nextInt();
        sc.nextLine();
        for (Student s : students) {
            if (s.id == id) {
                System.out.println("Found: " + s + "\n");
                return;
            }
        }
        System.out.println("Student not found.\n");
    }

    static void displayAll() {
        if (students.isEmpty()) {
            System.out.println("No students in the list.\n");
        } else {
            System.out.println("Student List:");
            for (Student s : students) {
                System.out.println(s);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        while (true) {
            System.out.println("1. Add\n2. Remove\n3. Search\n4. Display All\n5. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1: addStudent(); break;
                case 2: removeStudent(); break;
                case 3: searchStudent(); break;
                case 4: displayAll(); break;
                case 5:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice.\n");
            }
        }
    }
}
