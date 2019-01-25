import java.util.Scanner;

public class MinMax
{
  public static void main(String[] args)
  {
   int i = 1;

   while (i <= 5)
   {
    int smallest = 0;
    int largest = 0;

    System.out.println("Enter number: ");
    Scanner input = new Scanner(System.in);
    int number = input.nextInt();

    System.out.println("Amount of numbers entered: " + i);

    System.out.println("Number entered: " + number);

    if (number < min)
    {
      min = number;
    }
    System.out.println("Smallest # so far: " + min);

    if (number > max)
    {
      max = number;
    }
    System.out.println("Largest # so far: " + max);


    i++;

   }
 }
}
