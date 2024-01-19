
import java.util.*;
public class countingDuplicate {

    // Counting duplicate characters: Write a program that counts duplicate
    // characters from a given string.

    public static int countDuplicateVal(String givenString) {
        int count = 0;

        Set<Character> list = new HashSet<>();
        char[] x = givenString.toCharArray();
        // for (int i = 0; i < givenString.length(); i++) {

        //     if (!list.add(givenString.charAt(i))) {
        //         count++;

        //     }
        // }

        for (Character character : x) {
            
                    if (!list.add(character)) {
                count++;

            }
           // System.out.println(character);
         }
        return count;
    }
   


  public static void main(String[] args) {

      System.out.println(countDuplicateVal("abcaabbb"));

}
}