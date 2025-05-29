package emailApp;

import java.util.Scanner;

public class Email {
    private String fName;
    private String lName;
    private String passward;
    private int defaultpasswardLength=10;
    private String department;
    private String company="abc.com";
    private int mailboxcapacity=500;
    private String alternateEmail;

    //constructor to receive first and last name
    public Email(String firstName,String lastName){
        this.fName=firstName;
        this.lName=lastName;
        this.department=setDepartmant();
       
        this.passward=randomPassward(defaultpasswardLength);
        
        //combine elements to generate email
        System.out.println("\nEMAIL : "+fName.toLowerCase()+""+this.lName.toLowerCase()+"@"+department+"."+company);
    }

    //Ask for the department
    private String setDepartmant()
    {
        System.out.println("DEPARTMENT CODES:\n 1 for sales\n 2 for Development\n 3 for Accounting\n 0 for none\nEnter the Department");
        Scanner in =new Scanner(System.in);
        int choice=in.nextInt();
        if(choice==1){ return "sales";}
        else if(choice==2){ return "Development";}
        else if(choice==3){ return "accounts";}
        else { return "";}

    }

    //generate a random passward
    private String randomPassward(int length)
    {
        String passwardSet="abcdefghijklmnopqrstuvwxyz0123456789!@*$%";
        char[] passward=new char[length];
        for(int i=0;i<length;i++){
            int rand=(int)(Math.random()*passwardSet.length());
            passward[i]=passwardSet.charAt(rand);

        }
        return new String(passward);
    }

    //set mailboxCapacity
    public void setmailboxCapacity(int mailboxcap)
    {
        this.mailboxcapacity = mailboxcap;
       
    }
    //set the alternate email
    public void setalternateEmail(String altEmail)
    {
        this.alternateEmail=altEmail;
        
    }

    //change the passward
    public void setChangePassward(String changePassward)
    {
        this.passward=changePassward;

    }

    //getting modified mailboxcapacity
    public int getmailboxCapacity()
    {
        return mailboxcapacity;
    }

    //getting modified alternateEmail
    public String getalternateEmail()
    {
        return alternateEmail;
    }

    //getting modifies passward
    public String getChangePassward()
    {
        return passward;
    }

    //method to showinfo
    public String showinfo()
    {
        return "\nAccount has been Created\n Full Name : "+fName+" "+lName+
        "\n Department : "+department+
        "\n To Contact He/She: \n Email : "+alternateEmail+
        //"\nPassward : "+passward
        "";
    }
}
