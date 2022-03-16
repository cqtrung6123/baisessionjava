package session3;

import java.util.Scanner;

public class Customer {
    public static void main(String[] args) {
        long customerCode;
        String customerName;
        int customerAge;
        double depositAmount;

        System.out.println("Enter the details foe the new customer");
        //create the odject of scanner class to accept values;
        Scanner input=new Scanner(System.in);
        //accepts values and initalize the variables
        System.out.println("Enter the Four-digit Customer Code");
        customerCode = input.nextLong();

        System.out.println("Enter the customer name");
        customerName=input.next();

        System.out.println("Enter the customer Age");
        customerAge=input.nextInt();

        System.out.println("Enter the Amount Deposited ");
        depositAmount= input.nextDouble();
        //display the value of variables

        System.out.println("\nCustomerCode\t\tCustomerName\t\tCustomerAge\t\tDepositAmount");
        System.out.println("=====================================================");
        System.out.format("%d\t\t%s\t\t\t%d\t\t\t%f",customerCode,customerName,customerAge,depositAmount);
    }
}
