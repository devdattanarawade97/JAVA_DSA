import java.util.HashSet;
import java.util.Set;

public class checkInteger {
    

    public static boolean checkInt(String x) {
      
        
        boolean status = false;
        for (int i = 0; i < x.length(); i++) {
            
            try {
                int val = Integer.parseInt(String.valueOf(x.charAt(i)));
                status = true;
            } catch (Exception e) {
                // TODO: handle exception

                return false;
            }
        

        }
        return status;
    }


    public static void main(String[] args) {
        
        String y = "49595b";

        System.out.println(checkInt(y));
    }

   
}
