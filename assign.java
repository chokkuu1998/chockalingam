import java.util.Scanner;

public class Assignment2_A 
{

    public static void main(String[] args) 
    {
        Scanner firstname = new Scanner(System.in);
        String firstname1 = firstname.next();
        firstname1 = firstname1.replaceAll("[^A-Z]","");
        System.out.println(firstname1);
    }
}
