import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        int age ;
        double height;
        String name;

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name");
        name=sc.next();
        System.out.println("Enter your age:");
        age= sc.nextInt();
        System.out.println("Enter your height in meters");
        height=sc.nextDouble();

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height + " meters");
    }
}


