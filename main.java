import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.Console;
import java.util.*;
public class main {
    


    public static void main(String[] args) {
        

        Car car = new Car();

        
        car.getVehicleType();
   

        // Console cons = System.console();
        // System.out.println("enter data");
        // String x = cons.readLine();

        // System.out.println("outut is " + x);
        Logger logger = Logger.getAnonymousLogger();
        List<String> list = new ArrayList<>();
        list.add("x");
        list.add("a");
        list.add("a");
        Collections.sort(list);
        System.out.println(Collections.frequency(list , "a"));
        System.out.println(list);

        String s = null;
        try {

            System.out.println(s.length());
            
        } catch (Exception e) {
            // TODO: handle exception
            logger.log(Level.SEVERE, "\\u001B[31mException occured", e);
        }
    }
}
