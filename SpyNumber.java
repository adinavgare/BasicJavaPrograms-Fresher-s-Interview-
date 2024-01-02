import java.util.*;
public class SpyNumber
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int sum=0;
        int multiply=1;

        while(n>0)
        {
            int lastDigit = n%10;
            sum=sum+lastDigit;
            multiply=multiply*lastDigit;
            n=n/10;
        }

        if(sum==multiply)
        {
            System.out.println("Entered Number is Spy Number");
        }
        else
        {
            System.out.println("Entered Number is not Spy Number");
        }
        sc.close();

    }//end main
} //end class       