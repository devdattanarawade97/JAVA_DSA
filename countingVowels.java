import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class countingVowels {



    private static int countVowel(String x) {
        
        Set<String> list = new HashSet<>();


        for (int i = 0; i < x.length(); i++) {
            
            list.add(String.valueOf(x.charAt(i)));


        }
        String[] vowels = new String[] { "a", "e", "i", "o", "u" };

        int vowelCount = 0;
        int consonantCount = 0;
        for (String eachVowel : vowels) {

            if (list.contains(eachVowel)) {
                vowelCount++;
            }
            else {
                consonantCount=consonantCount+1;
                
            }
        }
        System.out.println("vowel count is " + vowelCount);
          System.out.println("consonant count is "+consonantCount);
        return vowelCount;
    }



    public static void main(String[] args) {
        


        String x = "abcdefghi";
        
        System.out.println(countVowel(x));


    }

  
    
}
