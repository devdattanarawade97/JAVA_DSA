import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Date;

import javax.swing.text.DateFormatter;

public class stringToDate {
    
    public static String toStringMethod() {

        LocalDateTime localDateTime = LocalDateTime.now();
        
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-mm-dd");

        String localDateString = dateTimeFormatter.format(localDateTime);

         
        return localDateString;
        
      }

    public static void main(String[] args) {
        
        
        System.out.println(toStringMethod());

    }
}
