import java.util.Scanner;
class MyCab
{
    
    public static void main(String[]args)
    {
        double fare=0;
        double km,t;
        Scanner sc = new Scanner (System.in);
        System.out.println("              Welcome to MY CAB!!!!!");
        System.out.println("*************************************************");
        System.out.println("*************************************************");
        
        System.out.println("Enter 1 for Day\nEnter 2 for Night\nEnter 3 for Full day booking :");
        int choice = sc.nextInt();
        switch(choice)
        {
        case 1:
        {
            
            System.out.println("DAY \n");
            System.out.println("Enter the distance covered (in kms): ");
            km = sc.nextDouble();
            System.out.println("Enter the waiting time (in mins): ");
            t = sc.nextInt();
            if (km>0 && km<=1.5)
            {
            fare = 29+t*2;
            }
            else
            {
            km = km-1.5;
            fare = 29+km*20+t*2;
            }
        }
        break;
        case 2:
        {
            
            System.out.println("NIGHT \n");
            System.out.println("Enter the distance covered (in kms): ");
            km = sc.nextDouble();
            System.out.println("Enter the waiting time (in mins): ");
            t = sc.nextInt();
            if (km>0 && km<=1.5)
            {
            fare = 35+t*3;
            }
            else
            {
            km = km-1.5;
            fare = 35+km*30+t*3;
            }
        }
        break;
        case 3:
        {
            
            
            System.out.println("FULL DAY BOOKING\n");
            System.out.println("Enter 1 for NON-AC\nEnter 2 for AC :\n ");
            int ch = sc.nextInt();
            System.out.println("Enter the distance covered (in kms): ");
            km = sc.nextDouble();
            switch(ch)
            {
            case 1:
            {
                if (km>0 && km<=200)
                {
                fare = 5000;
                }
                else
                {
                km = km-200;
                fare = 5000+km*20;
                }
            }
            break;
            case 2 :
            {
                if (km>0 && km<=200)
                {
                fare = 7000;
                }
                else
                {
                km = km-200;
                fare = 7000+km*40;
                }
            }
            break;
            default :
            {
                System.out.println("Invalid option\n");
            }
            }
            
        }
        default :
        {
            System.out.println("Invalid option\n");
        }
        }
        System.out.println("       Thank you for riding with us !!!!!");
        System.out.println("*************************************************");
        System.out.println("Total fare :                              "+fare+"\n");
        System.out.println("*************************************************");

    }    
}