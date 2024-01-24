
import java.util.*;

public class reverseLetterAndWord {

  // Reversing letters and words: Write a program that reverses the letters of
  // each word and a program that reverses the letters of each word and the words
  // themselves.

  public static String reverse(String givenString) {

    String[] values = givenString.split(" ");
    String result = "";
    for (String eachVal : values) {

      for (int i = eachVal.length() - 1; i >= 0; i--) {

        result = result + String.valueOf(eachVal.charAt(i));
      }
      result = result + " ";
    }

    // System.out.println(result);
    String finalString = "";
    for (int k = result.length() - 1; k >= 0; k--) {
      finalString = finalString + String.valueOf(result.charAt(k));
    }

    return finalString;
    //

  }

  //reverse method :
  public static String reverse1(String givenString) {

      
    StringBuilder builder= new StringBuilder(givenString).reverse();
    return builder.toString();

  }

  public static void main(String[] args) {

    System.out.println(reverse("hello world"));
    System.out.println(reverse1("hello world"));
  }
}