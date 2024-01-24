import java.util.*;

public class vowelCount {

  static Set<Character> list = new HashSet(Arrays.asList('a', 'e', 'i', 'o', 'u'));

  public static int count(String val) {

    int vowelCount = 0;
    int consonantCount = 0;
    for (int i = 0; i < val.length(); i++) {

      if (list.contains(val.charAt(i))) {
        vowelCount++;
      } else {
        consonantCount++;
      }

    }
    return vowelCount;

  }

  public static void main(String[] args) {

    System.out.println(count("aabcd"));

  }
}
