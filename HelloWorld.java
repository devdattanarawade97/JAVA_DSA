import java.util.*;
import java.util.Map.Entry;
public class HelloWorld{


  public static int mostAppearance(String x) {
    int max = 0;
   
    try {
     
    Map<String, Integer> list = new HashMap<>();

    char[] a = x.toCharArray();

    for (char c : a) {

      String ac = String.valueOf(c);
      if (!list.containsKey(ac)) {

        list.put(ac, 1);
      } else {
          
        list.put(ac, list.get(ac) + 1);
      }
    }

 

    for (Entry<String, Integer> eachVal : list.entrySet()) {

      if (eachVal.getValue() > max) {
        max = eachVal.getValue();

      }
    }
    
  
  } catch (Exception e) {
    // TODO: handle exception

    e.printStackTrace();
  }

  return max;
  }


public static void main(String[] args) {

  

  System.out.println(mostAppearance("abcdaa"));
}
}