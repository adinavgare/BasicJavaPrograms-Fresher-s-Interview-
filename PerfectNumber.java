import java.util.*;
public class PerfectNumber
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int originalNumber = n;
        int count=0;

        for(int i=1; i<n; i++)
        {
            if(n%i==0)
            {
                count = count+i;
            }
        }

        if(originalNumber==count)
        {
            System.out.println("Entered Number is Perfect Number");
        }
        else
        {
           System.out.println("Entered Number is Not Perfect Number"); 
        }

    }//end main
}//end class        
