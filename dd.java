import java.util.*;
public class dd
{
public static void main (String [] args) 
{
int i = 0;
int n = 0;
Scanner input = new Scanner(System.in);
 System.out.print("Enter i: ");
         i = input.nextInt();
         System.out.print("Enter n: ");
         n = input.nextInt();

         if ((i <= 1) || (n <= 1)) {
            System.out.println("Please enter numbers above 1");
            System.exit(1);
         }

         System.out.print(n + " multiples of " + i + " are: ");

   }
}
