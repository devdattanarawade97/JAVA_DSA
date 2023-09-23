import java.util.HashSet;
import java.util.Set;

public class countingDuplicate {
    

    public static int duplicateCount(String x) {
        
        Set<Character> list = new HashSet<>();
        int count = 0;
        for (int i = 0; i < x.length(); i++) {
             
            if (!list.add(x.charAt(i))) {
                count = count + 1;
            }

        }
        return count;

    }


    public static void main(String[] args) {
        

        String x = "abcdebbff";
          System.out.println(duplicateCount(x));
    } 

    
}