import java.util.HashMap;
import java.util.Scanner;

public class PermutationArray
{
    
    static int replaceCount=0;
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Input : ");
        int n=sc.nextInt();
        int[] array=new int[n];
        
        for(int i=0;i<n;i++)
            array[i]=sc.nextInt();
        
        convertToPermutation(array);
        
        System.out.println("Output :");
        System.out.println(replaceCount);
        for(int i=0;i<n;i++)
            System.out.print(array[i] + " ");
        
    }
    
    private static int[] convertToPermutation(int[] array)
    {
        HashMap<Integer,Integer> count = new HashMap<>();
        HashMap<Integer,Boolean> visited = new HashMap<>();
        int n=array.length;
        for(int i=0;i<n;i++)
        {
            if(count.containsKey(array[i]))
            {
                count.put(array[i],count.get(array[i])+1);
            }
            else
            {
                count.put(array[i],1);
                if(array[i]<=n && array[i]>=1)
                {
                    visited.put(array[i],false);
                }
            }
        }
        
        int currentMissingNumber=1;
        for(int i=0;i<n;i++)
        {
            if(count.get(array[i])!=1 || array[i]>n || array[i]<1)
            {
                while(count.containsKey(currentMissingNumber))
                {
                    currentMissingNumber++;
                }   
                if(array[i]<=n && array[i]>=1)
                {
                    if(!visited.get(array[i]) && currentMissingNumber>=array[i])
                    {
                        visited.put(array[i],true);
                        continue;
                    }
                }
                count.put(array[i],count.get(array[i])-1);
                array[i]=currentMissingNumber;
                replaceCount++;
                count.put(currentMissingNumber, 1);
            }
        }
        return array;
    }
}
