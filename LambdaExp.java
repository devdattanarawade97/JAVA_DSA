import java.util.function.Predicate;

public class LambdaExp {

  

    public static void main(String[] args) {
    
      
        find<Integer> fi=(Integer x)->{
           
            return x>0?true:false;

        };

        System.out.println(fi.check(-1));


        Predicate<String> check=(String x)->{

            return x.contains("abc");
        };

        System.out.println("checked test : "+check.test("wefe cde"));
   }
    

}
