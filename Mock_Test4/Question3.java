import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 Write a Java program to calculate the average of a list of numbers using a do-while loop.
 */
public class Question3 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
    List<Integer>list=new ArrayList<>();
        System.out.println("Enter the number  (0 to finish) ");
        int number;
        int sum=0;
        int count=0;
        do{

            number=sc.nextInt();
            if(number!=0){
                sum+=number;
                list.add(number);
                count++;
            }
        }while(number !=0);

        if(count==0){
            System.out.println("Sorry there is no element");
        }else{
            double avg=(double)sum/(double)count;
            System.out.println("Average of "+list +" is:"+avg);

                    
        }


    }
}
