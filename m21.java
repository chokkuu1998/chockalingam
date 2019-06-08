public class DuplicateCharacters
{

    public static void main(String[] args) 
    {
        
        Scanner s = new Scanner(System.in);
        System.out.println("Enter String: ");
        String str = s.nextLine();

        for(int i=0;i<str.length()-1;i++)
        {
            for(int j=i+1;j<str.length();j++)

            {
            if(str.charAt(i)==str.charAt(j))
            {

                System.out.print(str.charAt(j));
            }
            }
        }
    }

}
