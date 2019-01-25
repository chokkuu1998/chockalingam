import java.util.Scanner;
public class SwappingTwoArrays {
    public static void main(String[] args) {
        Scanner input_size = new Scanner(System.in);
        System.out.println("Enter the Size of Arrays : ");
        int size = input_size.nextInt();
        int[] array1 = new int[size], array2 = new int[size], buffer = new int[size];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Array of Elements: ");
        for (int i = 0; i < size; i++) {
            array1[i] = sc.nextInt();
        }
        System.out.println("Enter the Second Array of Elements: ");
        for (int i = 0; i < size; i++) {
            array2[i] = sc.nextInt();
        }
        System.out.println("Before Swapping");
        System.out.println("First Array: ");
        for (int i = 0; i < size; i++) {
            System.out.print(array1[i]);
        }
        System.out.println("\nSecond Array: ");
        for (int i = 0; i < size; i++) {
            System.out.print(array2[i]);
        }
        for (int i = 0; i < size; i++) {
            buffer[i] = array1[i];
            array1[i] = array2[i];
            array2[i] = buffer[i];
        }
        System.out.println("\nArrays after Swapping");
        System.out.println("First Array: ");
        for (int i = 0; i < size; i++) {
            System.out.print(array1[i]);
        }
        System.out.println("\nSecond Array: ");
        for (int i = 0; i < size; i++) {
            System.out.print(array2[i]);
        }
    }
}
