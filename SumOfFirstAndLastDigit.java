import java.util.*;
public class SumOfFirstAndLastDigit
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int originalNumber = n;
        int lastDigit = n%10;

        while(n > 0)
        {
            int lastDigit1 = n%10;
            n = n/10;
            if(n==0)
            {
                int sum = lastDigit+lastDigit1;
                System.out.println("The Sum of first and last digit of " + originalNumber + " is: " + sum);
            }
        }


    }//end main
}//end class        