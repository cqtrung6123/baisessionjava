import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeMain {
    public static void main(String[] args) {
        try {
            BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
            //create an instance of BufferedReader class to read form the console
            Map<String, LocalDate> hm = new HashMap<String,LocalDate>();
            //create a hashMap instance to store employee id and date of birth
            System.out.println("Enter the total number of Employee ");
            int size=Integer.parseInt(input.readLine());
            for (int i=0;i<size;i++){
                System.out.println("Enter the employee id");
                String empID=input.readLine();
                System.out.println("Enter the date of birth in this format dd/MM/yyyy");
                String strDOB=input.readLine();
                //use DateTimeFormatter to format the given input date into specific format
                DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd/MM/yyyy");
                LocalDate dob =LocalDate.parse(strDOB,formatter);
                //convert the formatted string back into date
                hm.put(empID,dob);//add the employee empID and dob into the hashmap
            }
            retirementList(hm);//invoke the method retirementLists with the hashmap

        } catch (IOException ex)
        {
            System.out.println(ex.getMessage());
        }
    }

public static void retirementList(Map<String,LocalDate>hm){
        LocalDate currentDate=LocalDate.now();//retrieve the current date
    //display the current date
    DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd/MM/yyyy");
    System.out.println("Current Date is :" + currentDate.format(formatter));
    LocalDate dateOfBirth;//create a variable of type LocalDate named dateOfBirth
    String empID;
    List<String> list=new ArrayList<String>();
    System.out.println("Retirement List");
    //for every employee in the list ,perform this iteration
    for (Map.Entry<String,LocalDate> me:hm.entrySet()) {
        empID=me.getKey();
        dateOfBirth=me.getValue();
        Period diff=Period.between(dateOfBirth,currentDate);//Period class í used to retrieve an amount ò time with date-based values
        int diff1=Period.between(dateOfBirth,currentDate).getYears();//retrieve the year
        int dif4=66- (int) diff1;
        int diff2=Period.between(dateOfBirth,currentDate).getMonths();//retrieve the months
        int dif6=12-diff2;
        int age=diff.getYears();//retrieve the age ò employee
        if(age>66)//check age in list
        {
            list.add(empID);//stored in list
            System.out.println("Emp Id:" + empID +"retired already");
        }
        else {
            System.out.println("Emp Id:" + empID + "has" + dif4 + "years" + dif6 + "months  foe retirement");
        }

    }
}

}
