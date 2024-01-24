import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class checkAnagrams {

    public static boolean checkForAnagrams(String a, String b) {

        Map<String, Integer> list1 = new HashMap<>();
        Map<String, Integer> list2 = new HashMap<>();

        for (char x : a.toCharArray()) {

            String abc = Character.toString(x);
            if (!list1.containsKey(abc)) {
                list1.put(abc, 1);
            } else {

                list1.put(abc, list1.get(abc) + 1);
            }
        }
        
        for (char y : b.toCharArray()) {

            String abc = Character.toString(y);
            if (!list2.containsKey(abc)) {
                list2.put(abc, 1);
            } else {

                list2.put(abc, list2.get(abc) + 1);
            }
        }
        

        int sum = 0;
        boolean status = false;
        Set<Map.Entry<String, Integer>> entry1 = list1.entrySet();
        Set<Map.Entry<String, Integer>> entry2 = list2.entrySet();
        for (Map.Entry<String, Integer> eachVal1 : entry1) {

            for (Map.Entry<String, Integer> eachVal2 : entry2) {
         

                String key1 = eachVal1.getKey();
                String key2 = eachVal2.getKey();
                    
                // System.out.println(key1);
                // System.out.println(key2);
                System.out.println(eachVal1);
                System.out.println(eachVal2);
                if (eachVal1.getValue().equals(eachVal2.getValue())) {
                    status = true;
                } else {
                    
                    status = false;
                }
            }
           

        }


        return status;

        
    }

    public static void main(String[] args) {

     System.out.println(   checkForAnagrams("Listen", "Silentt"));
    }
}
