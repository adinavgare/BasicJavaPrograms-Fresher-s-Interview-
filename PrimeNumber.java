import java.util.*;
class PrimeNumber
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int i, temp=0;

        for(i=2; i<n; i++)
        {
            if(n%i==0)
            {
                temp++;
            }
        }
        if(temp==0)
        {
            System.out.println("Entered Number is Prime Number");
        }
        else
        {
            System.out.println("Entered Number is Not Prime Number");
        }

    }//end main
}//end class