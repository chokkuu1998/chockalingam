public class Multiples
{	
	public static void main(String[] args)
	{
		boolean first = true;
		
		for (int i = 0; i < 50; i++)
		{	
			if (i % 3 == 0 && first == false)
			{
				 System.out.print(i);   
				 if(i % 15 != 0)
				 	System.out.print(",");
			}
			if(i % 15 == 0)
				System.out.println();   
			first = false; 
		}
	}
}
