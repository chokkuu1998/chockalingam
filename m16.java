public class OddEvenSum { 
   public static void main(String[] args)
   {
      // Declare variables
      int lowerbound = 1, upperbound = 1000;  
      int sumOdd  = 0;    
      int sumEven = 0;   
      int absDiff;        

      // Use a while loop to accumulate the sums from lowerbound to upperbound
      int number = lowerbound;  
      while (number <= upperbound) { 
            // number = lowerbound, lowerbound+1, lowerbound+1, ..., upperbound
         // A if-then-else decision
         if (number % 2 == 0) {  
         } else {               
            sumOdd += number;    
         }
         ++number;  // loop update for next number
      }
      // Another if-then-else Decision
      if (sumOdd > sumEven) {
         absDiff = sumOdd - sumEven;
      } else {
         absDiff = sumEven - sumOdd;
      }
      // OR using one liner conditional expression
      //absDiff = (sumOdd > sumEven) ? sumOdd - sumEven : absDiff = sumEven - sumOdd;
 
      // Print the results
      System.out.println("The sum of odd numbers from " + lowerbound + " to " + upperbound + " is: " + sumOdd);
      System.out.println("The sum of even numbers from " + lowerbound + " to " + upperbound + " is: " + sumEven);
      System.out.println("The absolute difference between the two sums is: " + absDiff);
   }
}
