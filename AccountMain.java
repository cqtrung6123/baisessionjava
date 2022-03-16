package bankingapplication;
import java.util.Scanner;
import java.util.Base64;
import java.io.UnsupportedEncodingException;
public class AccountMain {
    static String userId = "admin";
    static String password = "Admin123";

    //method to encode the password
    public static String encodePassword() {
        String base64encodePassword = "";
        //logic for encoding
        try
        {
            base64encodePassword=Base64.getEncoder().encodeToString(password.getBytes("utf-8"));
            System.out.println("Base64 Encoded  String (basic) :" + base64encodePassword);

        }
        catch (UnsupportedEncodingException e)
        {
            System.out.println("Error:" +e.getMessage());
        }
        return base64encodePassword;
    }
 //method to encode the password
    public static String decodePassword(){
        String encodePassword=encodePassword();
        String base64DecodePassword=new String();
        //logic for decoding
        try {
           byte[] decodePassword=Base64.getDecoder().decode(encodePassword);
            System.out.println("original String :" + new String(decodePassword,"utf-8"));
            base64DecodePassword=new String(decodePassword,"utf-8");
        }
        catch (UnsupportedEncodingException e)
        {
            System.out.println("Error:" + e.getMessage());
        }
        return base64DecodePassword;
    }
    //method to validate the password
    public static Boolean validatePassword(Account objAccount){
        boolean output;
        String decodedPassword=decodePassword();
        String inputPassword=objAccount.getPassword();
        output=decodedPassword.equals(inputPassword);
        return output;
    }
    /**
     * @para, args the command line arguments
     */
    public static void main(String[] args) {
        String inPassword;
        Scanner input=new Scanner(System.in);
        Account objAccount=new Account();
        objAccount.setUserId(userId);
        System.out.println("Enter the password");
        inPassword=input.nextLine();
        objAccount.setPassword(inPassword);
        if (validatePassword(objAccount))
        {
            System.out.println("Admin password is successfully validate");
            System.out.println(objAccount.toString());
        }
        else {
            System.out.println("invalid password");
        }
    }
}
