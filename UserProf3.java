import java.util.Scanner;

class UserProfile{
    String name;
    int age;
    String email;
    String Phone;

    void CreateProfile(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name:");
        name = sc.nextLine();

        System.out.println("Enter your age:");
        age = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter your email:");
        email = sc.nextLine();

        System.out.println("Enter your Phone:");
        Phone = sc.nextLine();
    }

    void showProfile(){
        System.out.println("Name :" +name);
         System.out.println("Age    : " + age);
        System.out.println("Email  : " + email);
        System.out.println("Phone  : " + Phone);
    }
}


public class UserProf3 {
    public static void main(String[] args) {
        UserProfile user = new UserProfile();
        user.CreateProfile();
        user.showProfile();
    }
}
