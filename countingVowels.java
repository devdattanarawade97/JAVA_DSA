import java.util.ArrayList;
import java.util.Arrays;
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

    
    public static int countingVowels2(String x) {
        
        int number=0;
        try {
            
            String[] charList = x.split("");
            String[] vowelsList = new String[] { "a", "e", "i", "o", "u" };
            List<String> vowelArrayList = Arrays.asList(vowelsList);
            for (String eachChar : charList) {

                if (vowelArrayList.contains(eachChar)) {
                    number++;
                }
               
            }
            
            // number=charList.length;
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }
        
        return number;
        
    }

    public static void main(String[] args) {
        


        String x = "abcdefghi";
        
       // System.out.println(countVowel(x));
        System.out.println(countingVowels2(x));

    }

  
    
}
