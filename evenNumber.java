package session5;

public class evenNumber {
    public static void main(String[] args) {
        int i=0,sum=0;
        //iterares until the sum of first 10 even numbers is computer
        while (i<=20){
            if(i % 2 == 0){
                sum=sum+i;
            }
            i++;
        }
        System.out.println("sum of first 10 even number is " + sum);
    }
}
