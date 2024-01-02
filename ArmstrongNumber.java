import java.util.*;
public class ArmstrongNumber
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int originalNumber = n;
        int sum=0;

        while(n>0)
        {
            int lastDigit = n%10;
            int cube = lastDigit*lastDigit*lastDigit;
            sum=sum+cube;
            n = n/10;
        }

        if(originalNumber==sum)
        {
            System.out.println("Entered Number is Armstrong Number");
        }

        else
        {
            System.out.println("Entered Number is Not Armstrong Number");
        }


    }//end main
}//end class           