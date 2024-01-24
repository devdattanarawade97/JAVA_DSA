import java.util.*;

public class countingOccurance {

  public static Map<Character, Integer> count(String val) {
    Map<Character, Integer> list = new HashMap<>();
    int count = 0;
    for (int i = 0; i < val.length(); i++) {

      char ch = Character.toLowerCase(val.charAt(i));

      list.compute(ch, (k, v) -> v == null ? 1 : ++v);
      
    }
    return list;
  }

  public static void main(String[] args) {

    System.out.println(count("abcdaaAA"));

  }
}
