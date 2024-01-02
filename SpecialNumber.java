import java.util.*;
public class SpecialNumber
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int originalNumber = n;
        int sum=0;
        int multiply=1;

        while(n>0)
        {
            int lastDigit = n%10;
            sum=sum+lastDigit;
            multiply=multiply*lastDigit;
            n=n/10;
        }

            int calculateSumOfDigitsForSum = calculateSumOfDigits(sum);
            int calculateSumOfDigitsForMultiply =calculateSumOfDigits(multiply);

        int combinedResult = combinedResults(calculateSumOfDigitsForSum, calculateSumOfDigitsForMultiply);

        if(combinedResult==originalNumber)
        {
            System.out.println("The entered number is special number");
        }
        else
        {
            System.out.println("The entered number is not special number");
        }
    }//end main    

        //function to calculate sum of digits
        static int calculateSumOfDigits(int num)
        {
            int sum1=0;
            while(num>0)
            {
            int lastDigit = num%10;
            sum1 = sum1+lastDigit;
            num = num/10;
            }

            return sum1;
        }

        //function to combine result of var1 and var2
         static int combinedResults(int result1, int result2)
         {
            return Integer.parseInt(String.valueOf(result1) + String.valueOf(result2));
         }

    
}//end class        