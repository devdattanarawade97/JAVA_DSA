import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionsOfObject {

    public static void check() {
         
        //collection interface with arraylist class
        Collection<String> list = new ArrayList<>();

        //is empty method
        boolean a = list.isEmpty();

        System.out.println(a);

        //add 
        list.add("abc");
        list.add("cde");
        list.forEach(str -> System.out.println(str));
        
        //
        
        
    }

    public static void main(String[] args) {

       check();
    }
}
