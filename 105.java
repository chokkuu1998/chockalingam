import java.util.regex.*; 
  
public class GFG
{ 
    public static void main(String[] args) 
    { 
  
        
        String regex = "\\b(?<Geeks>[A-Za-z\\s]+)"; 
  
        Pattern pattern 
            = Pattern.compile(regex); 
  
    
        String stringToBeMatched 
            = "GeeksForGeeks"; 
  
 
        Matcher matcher 
            = pattern 
                  .matcher(stringToBeMatched); 
  
   
        MatchResult result 
            = matcher.toMatchResult(); 
        System.out.println("Current Matcher: "
                           + result); 
  
        while (matcher.find())
        { 
            // Get the group matched using group() method 
            System.out.println(matcher.group("Geeks")); 
        } 
    } 
    }
