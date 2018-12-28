import java.util.*;
public class Rainfall 
{
Scanner in=new Scanner(System.in);
int month=12;
double total=0;
double average;
double months[];
public Rainfall()
{
months=new double[12];
}
public void setMonths()
{
for(int n=1; n<=month; n++ )
 {
 System.out.print("Enter the rainfall (in inches) for month #"+n+": ");
  months[n-1] = in.nextDouble();
  while (months[n-1] < 0)
   {
   System.out.print("Rainfall must be at least 0. Please enter a new value.");
         months[n-1] = in.nextDouble();
        }
     }
}

public double getTotalRainFall()
{
    total = 0;
    for(int i=0; i<12;i++)
    {
        total=total+months[i];
    }
    return total;
}

public double getAverageRainFall()
{
    average = total/12;
    return average;
}

public double getHighestMonth()
{
    double highest=0;
    for ( int i = 0; i < 12; i++)
    {
        if ( months[i] > highest)
        {
            highest = months[i] ;
        }
    }
    return highest;
}

public double getLowestMonth()
{
    double lowest = Double.MAX_VALUE;
    for ( int n = 0; n < month; n++)
        {
            if (months[n] < lowest )
            {
                lowest = months[n];
            }
        }
        return lowest;
}

public static void main(String[]args)
{
    Rainfall r =new Rainfall();
    r.setMonths();
    System.out.println("The total rainfall for this year is " + r.getTotalRainFall());
            System.out.println("The average rainfall for this year is " + r.getAverageRainFall());
    System.out.println("The month with the highest amount of rain is " + months[n] + "with" + r.getHighestMonth() "inches");
            System.out.println("The month with the lowest amount of rain is  " + months[n] "with" + r.getLowestMonth() "inches");

}
