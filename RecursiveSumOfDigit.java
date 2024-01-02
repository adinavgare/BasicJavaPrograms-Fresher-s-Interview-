import java.util.*;
public class RecursiveSumOfDigit
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int originalNumber = n;

        int sum = calculateRecursiveSum(n);
        System.out.println("The recursive sum of " + originalNumber +" is:  " + sum);  
    }//end main


    // Recursive function to calculate the sum of digits
    static int calculateRecursiveSum(int num)
    {
        int lastDigit = num%10;
        int remainingDigits = num/10;

        if(remainingDigits == 0 && lastDigit < 10)
        {
            return lastDigit;
        }
        else
        {
            int currentSum = lastDigit + remainingDigits;
            return calculateRecursiveSum(currentSum);
        }

    }//end calculateRecursiveSum method
}//end class        