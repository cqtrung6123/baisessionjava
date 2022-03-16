package session5;

public class DisplayNumber {
    public static void main(String[] args) {
        int i=0;
      //labeled outer while loop
        outer:
      while (true){
          System.out.println("outer while loop");
          //innner while loop
          while (true){
              i++;
              System.out.println("i = " +i);
              if(i==1){
                  System.out.println("continue");
                  continue;
              }
              if(i==3){
                  System.out.println("continue outer");
                  continue outer;
              }
              if(i==5){
                  System.out.println("break");
                  break ;
              }
              if (i==7){
                  System.out.println("break outer");
                  break outer;
              }
          }
      }
    }
}
