import java.util.*;
public class PalindromeNumber
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int originalNumber = n;
        int reverse = 0;

        while(n>0)
        {
            int lastDigit = n%10;
            reverse = (reverse*10) + lastDigit;
            n = n/10;
        }

        if(reverse==originalNumber)
        {
            System.out.println("Entered Number is Palindrome Number");
        }
        else
        {
            System.out.println("Entered Number is not palindrome number");
        }





    }//end main
}//end class        