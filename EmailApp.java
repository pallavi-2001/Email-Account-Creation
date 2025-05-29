package emailApp;

import java.util.Scanner;

public class EmailApp {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Are you a new Employee(Yes/No)? : ");
        String confirm=sc.next();
        if(confirm.equalsIgnoreCase("Yes")){
            //Reading employee name by 2 ways 
            //Use any one way at each time by commenting one

            //1st way : Reading data by console
            /*System.out.println("Enter first name");
            String fname=sc.next();
            System.out.println("Enter last name");
            String lname=sc.next();
            Email e1=new Email(fname,lname);
            */

            //2nd way : Initializing a Constructor with first name and last name
            Email e1=new Email("Pallavi","H");
        
            //setting and getting alternative email ID of Employee
            e1.setalternateEmail("pavih@gmail.com");
            System.out.println("Email has been changed to "+e1.getalternateEmail());

            //setting and getting alternative passward of employee
            e1.setChangePassward("1234567890");
            System.out.println("Passward has been changed to "+e1.getChangePassward());

            //setting and getting alternative mailbox capacity
            e1.setmailboxCapacity(200);
            System.out.println("mailboxcapacity has been changed to "+e1.getmailboxCapacity()+"mb");

            //Printing all required details of employee
            System.out.println(e1.showinfo());
        }
        else
            System.out.println("You can't create Email");
    }
}
