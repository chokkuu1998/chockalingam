public class DeleteDemo
{
  public static void main(String args[])
  {					        // to delete one character
     StringBuffer buffer1 = new StringBuffer("Lord Almighty");
     buffer1.deleteCharAt(3);   		// deletes d
     System.out.println(buffer1);		// prints Lor Almighty
 
			// to delete a few characters
     StringBuffer buffer2 = new StringBuffer("UnitedStates");
     buffer2.delete(1, 11);   	                // deletes nitedState (1 to 9-1)
     System.out.println(buffer2);		// prints Us	
					// to delete all
     StringBuffer buffer3 = new StringBuffer("Himalayas");
     buffer3.delete(0, buffer3.length());   	// deletes all characters 
     System.out.println(buffer3);		// no output
  }
}
