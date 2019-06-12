class LuckyNumbers_1
{    
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the Number of Elements : ");
        int n=Integer.parseInt(br.readLine()); 
        int a[]=new int[n];
        int c=n; 
        for(int i=0;i<n;i++)
        {
            a[i]=i+1;
        }
        int del=1;
        System.out.println("\nLucky Number Operation :\n");
        while(del<n)
        {
            for(int i=del; i<n; i+=del)
            {
                for(int j=i; j<n-1; j++)
                {
                    a[j]=a[j+1];
                }
                n--;
            }
            del++;
            for(int i=0; i<n; i++)
            {
                System.out.print(a[i]+"   ");
            }
            System.out.println();
        } //end of while
        System.out.print("\nHence, the Lucky Numbers Less than "+c+" are : ");
        for(int i=0; i<n; i++)
        {
            System.out.print(a[i]+"   ");
        }
    }
}
