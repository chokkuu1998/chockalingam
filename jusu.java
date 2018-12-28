public class ArrayBasicLoopString {
public static void main(String[] args)
{
String[]arrayNames = new String[]{"andrew","juan","william","carnegie","will","anne"};
System.out.println("Direct access value :"+arrayNames[0]);
System.out.println("Length of the array:"+arrayNames.length);
for(int index=0;index&lt;arrayNames.length;index++){
	System.out.println("Value at index "+index +" is "+arrayNames[index]);
}	}
}
