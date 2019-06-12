public class Prime
{
    public static void main (String args[])
    {
        int num,count=0;
        Scanner scan = new Scanner(System.in); //scanner for input
        System.out.print("Enter any number : ");
        num = scan.nextInt();
        for(int i=2; i <= (num/2); i++) 
        {
            if((num % i) == 0)
            {
                count++;
                break;
            }
        }
        if((count==0) && (num!= 1))
        System.out.println( num + " is a prime number.");
        else
        System.out.println( num + " is not a prime number.");
    }
}
