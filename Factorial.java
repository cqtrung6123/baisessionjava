package session5;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int num;
        long fact=1;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number for factorial calculation:");
        num=input.nextInt();
        //iterates the loop until num evaluates to false
        do{
            fact=fact*num;
            num--;
        }while (num >= 1);
        System.out.println("factorial of a number :" +fact);
    }
}
