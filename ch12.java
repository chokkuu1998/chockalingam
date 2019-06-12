class GFG { 
      
    static final int max = 100000; 
      
    // function to convert num to base 6 
    static int baseconversion(int arr[],  
                          int num, int base) 
    { 
        int i = 0, rem, j; 
      
        if (num == 0) { 
            return 0; 
        } 
      
        while (num > 0) { 
              
            rem = num % base; 
            arr[i++] = rem; 
            num /= base; 
        } 
      
        return i; 
    
