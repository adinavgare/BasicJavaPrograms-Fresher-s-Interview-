import java.util.*;
public class FactorialOfNumber 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int f = 1;

        for(int i=1; i<=n; i++)
        {
            f = f*i;
        }

        System.out.println("The factorial of number is: " + f);

    }//end main
}//emd class
