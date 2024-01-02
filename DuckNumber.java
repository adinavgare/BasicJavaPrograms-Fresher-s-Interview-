import java.util.*;
public class DuckNumber
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();

        while(n > 0)
        {
            int lastDigit = n%10;
            
            
            if(lastDigit==0)
            {
                System.out.println("Entered number is Duck NUmber");
                return;
            } 

            n = n/10;

        }    

                System.out.println("Entered Number is Not Duck Number");


    }//end main
}//end class    
