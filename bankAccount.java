
import java.util.*;
public class bankAccount{
        public static void main(String[] args) {
        System.out.println("||===============================================||");
        System.out.println("||                                               ||");
        System.out.println("||         WELCOME TO UNION BANK OF INDIA        || ");
        System.out.println("||                                               ||");
        System.out.println("||===============================================||");
        Scanner sc = new Scanner(System.in);  
         System.out.println("Enter the name "); 
         String name=sc.nextLine();    
        System.out.println("Enter  Mobile No.");
        String mob = sc.nextLine();
        int value=0;
if( mob.length()==10){
        if(mob.equals("6261888637") || name.equals("Rahultota"))
        {
             System.out.print("Enter your pin: ");
            String pin1=sc.nextLine();
            if(pin1.equals("6261"))            
            {
                System.out.println("\n\n\t  USER DATA: \nName      : Rahultota \nA/C Number: 6261888637\n\n");     
                System.out.println("Choose Account Type: \n\n     1. Saving Account  \t     2. Current Account"); 
                String ac_type= sc.nextLine();
                if(ac_type.equals("1")) 
                {
                    System.out.println("\t    Please Select a Option\n");       

                    System.out.println("1. BALANCE INQUIRY\t\t2. FAST CASH\n3. CASH WITHDRAWAL\t\t4. SERVICES\n\n");
                     String option = sc.nextLine();
                    int bi=1000000;

                    if(option.equals("1"))
                    {
                        
                        System.out.println("\t     BALANCE INQUIRY\n\nAvailable Balance: "+bi);
                    }

                    else if(option.equals("2"))
                    {
                        System.out.println("\t     FAST CASH");
                        System.out.println("Sorry! this service is not available at this time.");
                    }

                    else if(option.equals("3"))
                    {
                        System.out.println("\t     CASH WITHDRAWAL ");
                        System.out.print("Availbile Amount: "+bi);
                        System.out.print("\nEnter Amount:     ");
                        value=sc.nextInt();
                        int remain=bi-value;

                        if(value<100)
                        {
                            System.out.println("Please Enter Amount more than 100.");
                        }
                        else if( value>=100 && value<=bi)
                        {
                        System.out.println("Remaining Balance: "+remain);
                        }
                        else if(value>=20000)
                        {
                        System.out.println("Max. 20000 allow per transition");
                        }   
                    }
                    else if(option.equals("4"))
                    {
                        System.out.println("\t     SERVICES\nFor more services visit @unionbankofindia/services.com or visit nearest branch.");
                    }

                    else
                    {
                        System.out.println("Invalid Input!");
                    }
                }
                else if(ac_type.equals("2"))
                {
                    System.out.println("No Current Account Found!");
                }
                else 
                {
                    System.out.println("Invalid Account Type");
                }
            
            System.out.println("\n\n\t     THANK YOU\n\t    Visit Again");
        }
    }else {
                        System.out.println("Invalid Input!");
                    }
                }
            }
  }  