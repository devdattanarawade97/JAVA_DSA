import java.util.ArrayList;
import java.util.List;

public class reverseLetter {
    

    public static String reversedString(String x) {
        
        List<String> list = new ArrayList<>();
          
        String[] val = x.split(" ");
        int count = 0;
        String ans = "";
        for (String y : val) {
            System.out.println(y);
            for (int i = y.length() - 1; i >= 0; i--) {

                ans = ans + y.charAt(i);

            }
            ans = ans + " ";
        
        }
        
        System.out.println(ans);
         
      

        return null;
      }

    public static void main(String[] args) {
        
        
        String x = "abcd cdef ghi";
        reversedString(x);

    }
}
