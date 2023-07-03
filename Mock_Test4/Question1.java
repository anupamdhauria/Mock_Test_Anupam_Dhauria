import java.util.Scanner;

/*Write a Java program to check whether a given number is
positive, negative, or zero using an if-else statement.*/
public class Question1 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int number;
        System.out.println("Enter a number:");
        number=sc.nextInt();
        checkNumber(number);

    }


    private static void checkNumber(int number) {

        if(number<0)
            System.out.println(number + " is negative");
        else if(number>0)
            System.out.println(number +" is positive");
        else
            System.out.println(number + " is zero");
    }
}
