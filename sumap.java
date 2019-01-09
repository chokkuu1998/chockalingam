import java.util.Scanner;

public class SumofAP {
public static void main(String[] arg)
    {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter first term, common difference and n (number of terms)");
    int a=sc.nextInt(),d=sc.nextInt(),n=sc.nextInt();
    System.out.print("Sum: "+n*(2*a+(n-1)*d)/2);
    }
}
