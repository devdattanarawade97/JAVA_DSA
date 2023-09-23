import java.util.HashSet;
import java.util.Set;

public class firstNonRepeatedNumber {



     public static char nonRepeatChar(String x) {
        
        Set<Character> list = new HashSet<>();
        char ansChar = '0';
        for (int i = 0; i < x.length(); i++) {
             
            if (!list.add(x.charAt(i))) {
                ansChar = x.charAt(i + 2);
                System.out.println(ansChar);
                break;
            }

        }
        return ansChar;

    }


    public static void main(String[] args) {
        

        String x = "aaaabcdebbff";
          System.out.println(nonRepeatChar(x));
    } 
    
}
