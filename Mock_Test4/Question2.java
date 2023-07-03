import java.util.Scanner;

/* Write a Java program to print the Fibonacci series up to a given number using a for loop.*/
public class Question2 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int term;
        System.out.println("Enter a Term:");
        term=sc.nextInt();
        fibonacci(term);

    }

    private static void fibonacci(int term) {

        int firstTerm = 0;
        int secondTerm = 1;
        int nextTerm = -1;
        if (term == 1)
            System.out.println(firstTerm);
        else if (term > 1) {
            System.out.print(firstTerm+" ");
            System.out.print(secondTerm+" ");

            for (int i = 3; i <= term; i++) {
                nextTerm = firstTerm + secondTerm;
                System.out.print(nextTerm + " ");
                firstTerm = secondTerm;
                secondTerm = nextTerm;
            }
        }
    }

}
