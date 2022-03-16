package session3;

import java.util.Scanner;

public class Invoice {
    public static void main(String[] args) {
       int orderedShirts,orderedTrousers,point=0;
       int priceOfShirt=300;
       int priceOfTrouser=700;
       int costOfshirt,costOfTrouser,totalCost;
       double discount,netpay;

        Scanner input=new Scanner(System.in);
        //accepts the order details of the customer
        System.out.format("Enter the number of shirts to order :");
        orderedShirts=input.nextInt();
        System.out.format("Enter the number of trousers th orde :");
        orderedTrousers=input.nextInt();
        //computer the total price of the order
        costOfshirt=priceOfShirt * orderedShirts;
        costOfTrouser=priceOfTrouser * orderedTrousers;
        totalCost=costOfshirt + costOfTrouser;
        //gives s discount only if the total cost exeeds $300
        discount=totalCost > 3000 ? totalCost * 10 / 100 : 0;
        netpay=totalCost - discount;
        //gives one persent of the netpay as exeeds $3000
        point = (int) (netpay > 3000 ? netpay / 100 : 0);

        //display
        System.out.println("\nItem\t\t Quantity \t Price \t Total");
        System.out.println("---------------------------------------");
        System.out.printf("Shirts\t\t %d \t\t\t %d \t\t %d\n", orderedShirts , priceOfShirt , costOfshirt);
        System.out.printf("Trousers\t %d \t\t\t %d \t\t %d \n", orderedTrousers , priceOfTrouser ,  costOfTrouser);
        System.out.printf("discount \t \t\t \t\t\t %.2f \n" ,  discount);
        System.out.println("_------------------------------------_");
        System.out.printf("nextTotal \t \t\t \t\t %.2f \n" , netpay);
        System.out.printf("Points earned \t %d \n" , point);



    }
}
