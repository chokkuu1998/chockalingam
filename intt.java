public static int[] getLongestAscending(int[] a) 
{
    int maxLength = 0;
    int maxStart = 0;
    int length = 1;
    int start = 0;
    boolean fullAscension = true;
    for (int i = 1; i < a.length; i++)
    {
    
        if (a[i]-1 == a[i-1])
        {
            length++;
        } else {
            fullAscension = false;
            if (length > maxLength)
            {
                maxLength = length;
                maxStart = start;
            }
            length = 1;
            start = i;
        }
    }
    if (fullAscension)
    {
        return a;
        
    }
    if (length > maxLength) 
    {
        maxLength = length;
        maxStart = start;
    }       int[] ret = new int[maxLength];
    System.arraycopy(a, maxStart, ret, 0, maxLength);
    return ret;
}
