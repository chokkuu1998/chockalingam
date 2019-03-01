import java.util.Scanner;

public class MathUnitConversions9
{

    public static void main(String[] args)
    {

        double kilograms;

        Scanner in = new Scanner(System.in);

        System.out.println("Please enter kilograms:");
        kilograms = in.nextDouble();

        double grams = kilograms * 1000;
        System.out.println(grams + " Grams");

    }
}
