package session4;

import java.util.Scanner;

public class EmployeeDetails {
    public static void main(String[] args) {
        int employeeId;
        String employeename;
        char gender;

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the employee identification code:");
        employeeId=scan.nextInt();
        //validate employeeid variables
        if(employeeId>0){
            System.out.println("Enter the employee Name:");
            Scanner s = new Scanner(System.in);
            employeename=s.nextLine();
            //validates employeename variable
            if(employeename.length()<40){
                System.out.println("Enter the gender: (m/f)");
                gender=scan.next("\\D").charAt(0);
                //validate gender variable
                if(gender=='M'||gender=='F'){
                    System.out.println("Employee code"  +  employeeId);
                    System.out.println("Employee Name" + employeename);
                    System.out.println("Employee gender" + gender);
                }else {
                    System.out.println("incorrect entry for gender");
                }
                //end of inner-if statement
            }
            else {
                System.out.println("Incorrect entry fo name");
            }
            //end of outer-if statement
        }
        else {
            System.out.println("incorect entry for employee identtification code");
        }
    }
}
