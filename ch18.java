class GFG 
{ 
   
    static boolean isLucky(int n) 
    { 
       
        for (int i = 0; i < 10; i++) 
            arr[i] = false;
        while (n > 0) 
        { 
            
            int digit = n % 10; 
      
          
            if (arr[digit]) 
            return false; 
      
          
            arr[digit] = true; 
      
           
            n = n / 10; 
        } 
        return true; 
    } 
      
    
    public static void main (String[] args) 
    { 
    int arr[] = {1291, 897, 4566, 1232, 80, 700}; 
        int n = arr.length; 
      
        for (int i = 0; i < n; i++) 
            if(isLucky(arr[i])) 
                System.out.print(arr[i] + " is Lucky \n"); 
            else
            System.out.print(arr[i] + " is not Lucky \n"); 
    } 
} 
