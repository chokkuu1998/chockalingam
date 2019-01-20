public class SubMatTry
{
public static void main(String[] args)
{
   
    int a[][] = { { 2, 3, 5, 7 }, { 5, 8, 3, 5 }, { 7, 6, 9, 2 },
            { 3, 8, 5, 9 } };
    int b[][] = { { 9, 2 }, { 5, 9 } };
    int k = 0;
    int l = 0;
    for (int i = 0; i < 4; i++)
    {
        for (int j = 0; j < 4; j++) 
        {
            System.out.println("Element of a= " + a[i][j]);
            if (b[k][l] == a[i][j]) {
                System.out.println(b[k][l] + " = " + a[i][j]);
                if (b[k][l + 1] == a[i][j + 1]) 
                {
                    System.out.println(b[k][l + 1] + " = " + a[i][j + 1]);
                    if (b[k + 1][l] == a[i + 1][j]) 
                    {
                        System.out.println(b[k + 1][l] + " = "
                                + a[i + 1][j]);
                        if (b[k + 1][l + 1] == a[i + 1][j + 1]) 
                        {
                            System.out.println(b[k + 1][l + 1] + " = "
                                    + a[i + 1][j + 1]);
                            System.out.println("Array found at" + i + " ,"
                                    + j);
                            System.exit(0);
                        }
                    }
                }
            }
        }

    }

}}
