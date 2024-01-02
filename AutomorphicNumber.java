import java.util.*;

public class AutomorphicNumber 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();

        if (isAutomorphic(num)) 
        {
            System.out.println(num + " is an Automorphic Number");
        } else {
            System.out.println(num + " is not an Automorphic Number");
        }
    }//end main

    // method for checking automorphic number or not.
    static boolean isAutomorphic(int num) 
    {
        int square = num * num;
        int divisor = 10;

        while (num > 0) 
        {
            if (num % 10 != square % divisor) 
            {
                return false;
            }
            num /= 10;
            divisor *= 10;
        }

        return true;
    }
}//end class
