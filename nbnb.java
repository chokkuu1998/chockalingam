import java.util.Arrays;

public class Main {
    static int[] numbers = {813, 907, 908, 909, 910};

    public static void main(String[] args)
    {
        int number = 907;
        //Integer number = 907; 
        boolean b = Arrays.asList(numbers).contains(number);
        System.out.println(b);  
    }
}
