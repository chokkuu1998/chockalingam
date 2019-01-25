 public class Main {

  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);

    System.out.println("enter size of the array: ");

    if (!in.hasNextInt()) {
      System.out.println("put an integer! ");
    }
    int size = in.nextInt();

    System.out.println("enter numbers for array");

    int[] array = new int[size];

    for (int i = 0; i < array.length; i++) {
      array[i] = in.nextInt();
    }

    maxSum(array);

    System.out.println(maxSum(array));
  }

  private static int maxSum(int[] array) {

    int max = array[0];

    for (int i = 0; i < array.length; i++) {
      for (int j = i + 1; j < array.length; j++) {

        int currentMax = array[i] + array[j];

        if (currentMax > max) {
          max = currentMax;
        }
      }
    }

    return max;
  }
}
