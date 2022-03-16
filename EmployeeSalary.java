package session4;

import java.util.Scanner;

public class EmployeeSalary {
    public static void main(String[] args) {
        double salary=0.0,bonus=0.0,taxAmount,netSalary;
        String designation;
        int yearsServer;
        //create the object of scanner class
        Scanner input = new Scanner(System.in);
        //accepts the value for desigination
        System.out.println("1:manager\n2:System analyst\n3:Developer\n4:Accountant");
        System.out.println("Enter the Eployee designation");
        designation=input.nextLine();
        //assign salary based on the designation
        switch (designation){
            case "Manager":
                salary=10000.5;
                break;
            case "System analyst":
                salary=5000.5;
                break;
            case "Developer":
                salary=80000.0;
                break;
            case "Accountant":
                salary=3000.5;
                break;
        }
        System.out.println("\t Employee Salary details");
        System.out.println("============================");
        System.out.printf("Employee Designation : \t %s%n",designation);
        System.out.printf("Employee Salary : \t $%.1f%n",salary);
        System.out.println("-------------------------------------");

        System.out.println("Enter the number of years severd in the company:");
        yearsServer=input.nextInt();
        if (yearsServer>=5){
            if(salary>20000){
                bonus=salary*0.09;
            }else if(salary>1200&&salary<=20000){
                bonus=salary*0.05;
            }else {
                bonus=salary*0.02;
            }
        }else if(yearsServer>=3){
            if(salary>20000){
                bonus=salary*0.07;
            }else if(salary>1200&&salary<=20000){
                bonus=salary*0.03;
            }else {
                bonus=salary*0.01;
            }
        }else {
            bonus=salary*0.05;
        }
            //display the calcuated bonus on the console
        System.out.printf("Employee Annual bonus amount: \t$%.2f%n",bonus);
    }
}
