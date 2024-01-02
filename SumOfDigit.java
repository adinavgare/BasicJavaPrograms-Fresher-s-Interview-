import java.util.*;
public class SumOfDigit 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int sum=0;

        while(n>0)
        {
        int lastDigit = n%10;
        sum = sum+lastDigit;
        n = n/10;
        }
        
        System.out.println("Sum of digits is: " + sum);
    }//end main    

}//end class   