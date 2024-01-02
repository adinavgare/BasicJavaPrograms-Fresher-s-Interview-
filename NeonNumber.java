import java.util.*;
public class NeonNumber
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int originalNumber = n;
        int product = n*n;
        int sum=0;

        while(product>0)
        {
            int lastDigit = product%10;
            sum = sum+lastDigit;
            product = product/10;
        }

        if(originalNumber==sum)
        {
            System.out.println("Entered Number is Neon Number");
        }
        else
        {
            System.out.println("Entered Number is not Neon Number");
        }

    }//end main
    
}//end class    