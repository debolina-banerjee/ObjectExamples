//Write a Java program to create a method that takes an integer as a parameter
// and throws an exception if the number is odd.Write a Java program to create a method
// that takes
// an integer as a parameter and throws an exception if the number is odd.

import java.util.Scanner;

public class CheckEvenException {


    //exception-handling
public static void checkException(int num){
    try {
        if(num%2==0){
            System.out.println("Even number");
        }
        else{
            throw new IllegalArgumentException("Odd number "+num+" is a wrong input ");
        }

    }
    catch(IllegalArgumentException e) {
        System.out.println(e.getMessage());
    }
    }


    //main()
    public static void main(String[] args) {
        System.out.println("Enter a number");
//        Scanner sc = new Scanner (System.in);
//        int num= sc.nextInt();
        int num=23;
        checkException(num);
    }

}
//IllegalArgumentException=>Match specific requirements