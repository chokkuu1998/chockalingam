public class NumberOf_Unique_Partitions 
{
    public static void print(int[] p, int n, int count) 
    {
        for (int i = 0; i < n; i++)
            System.out.print(p[i] + " ");
        System.out.println();
        int j;
        for (j = 0; j < n; j++) 
        {
            if (p[j] == 1)
                continue;
            else
                break;
        }
        if (j == n)
            System.out
                    .println("The number of ways to write a number as a sum of number smaller than itself is :"
                            + (count - 1));
    }
 
    public static void generateUniquePartition(int n) 
    {
        int[] p = new int[n];
        int k = 0, count = 0;
        p[k] = n;
        while (true) 
        {
            count++;
            print(p, k + 1, count);
            int rem_value = 0;
            while (k >= 0 && p[k] == 1) 
            {
                rem_value += p[k];
                k--;
            }
            if (k < 0)
                return;
 
            p[k]--;
            rem_value++;
 
            while (rem_value > p[k]) 
            {
                p[k + 1] = p[k];
                rem_value -= p[k];
                k++;
            }
            p[k + 1] = rem_value;
            k++;
        }
    }
 
    public static void main(String args[]) 
    {
        System.out.println("Unique Partitioning of a given number");
        System.out.println("Enter the number:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        generateUniquePartition(n);
        sc.close();
    }
}
