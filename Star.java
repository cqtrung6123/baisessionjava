package session5;

import java.util.Scanner;

public class Star {
    public static void main(String[] args) {
        int row;
        //create the object of scanner class
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the maximun number of row for displaying star:");
        row=input.nextInt();
        //iterares outer-for loop until the spacified rows of star are displayed
        for (int i=1;i<=row;i++){
            //iterares for loop to display spaces in the console
            for(int space=row;space>=i;space--){
                System.out.print(" ");
            }
            //iterares until the number of star displayed equals i
            for (int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }//end of the outer-for loop
    }
}
