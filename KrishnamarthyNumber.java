import java.util.*;
public class KrishnamarthyNumber
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
            int fact=1;
            int lastDigit = n%10;
            for(int i=1; i<=lastDigit; i++)
            {
                fact = fact*i;
                
            }

            sum = sum+fact;
            n = n/10;
        }

        if(sum==originalNumber)
        {
            System.out.println("Entered Number is Krishnamarthy Number");
        }
        else
        {
            System.out.println("Entered Number is not Krishnamarthy Number");
        }

    }//end main
}//end class        