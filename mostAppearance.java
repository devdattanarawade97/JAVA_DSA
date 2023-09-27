import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class mostAppearance {
    

    static  Map<String, Integer> list = new HashMap<>();


    public static int mapValue(String x) {
       

        for (char val : x.toCharArray()) {
            if (!list.containsKey(String.valueOf(val))) {

                list.put(String.valueOf(val), 1);
            } else {

                // System.out.println(list.get(String.valueOf(val)));
                list.put(String.valueOf(val), list.get(String.valueOf(val)) + 1);
            }

        }
     
        int max = 0;
        for (Entry<String, Integer> keys : list.entrySet()) {
            
            if (keys.getValue() > max) {
                max = keys.getValue();
            }
           
        }
          

        return max;
    }
   
    

    public static void main(String[] args) {
        

        String x = "abcdgg";

       System.out.println(mapValue(x));


    }

   
}
