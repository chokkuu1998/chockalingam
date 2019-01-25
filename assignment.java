public class Arrayassignment 
{
    public static void main(String[] args)
    {
        Scanner sin = new Scanner(System.in);
        System.out.println("Enter an intiger for array size.");

        int number = sin.nextInt();

        int array[] = new int[number];

        System.out.println("Array size " + number + " initiated.\n");

        System.out.println("Now enter the array intigers.");
        for (int i = 0; i < number; i++) 
        {
            array[i] = sin.nextInt();
        }

        sin.close();

        System.out.println("sorting");
        printArray(array); 
        sort(array);
        printArray(array);
        System.out.println("The highest number in the array is " + array[array.length - 1]);
        System.out.println("The smallest number in the array is " + array[0]);
        System.out.println("The average of the numbers in the array is " + avg(array));
    }

    public static void sort(int[] arg) 
    {
        int arrange;
        for (int i = 0; i < arg.length - 1; i++)
            for (int j = i + 1; j < arg.length; j++)
            {

                if (arg[i] > arg[j]) {
                    arrange = arg[i];
                    arg[i] = arg[j];
                    arg[j] = arrange;
                }
            }
    }

    public static double avg(int... arr)
    {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) 
        {
            sum += arr[i];
        }
        double average = (double) sum / arr.length;
        return average;
    }

   public static void printArray(int[] arr)
   {
      for (int value : arr) {
        
        
         System.out.println(value);
    }
}
