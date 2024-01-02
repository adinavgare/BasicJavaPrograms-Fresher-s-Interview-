import java.util.*;
public class CountDigit
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int count=0;

        while(n>0)
        {
            int lastDigit = n%10;
            count++;
            n = n/10;
        }
        System.out.println("Count of digits is :" + count);


    }//end main
    
}//end class    