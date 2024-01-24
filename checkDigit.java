import java.util.*;


public class checkDigit{


 

    public static  boolean count(String val){

     
     for(int i=0;i<val.length();i++){

        if(!Character.isDigit(val.charAt(i))){
          return false;
        }
        

     }
     return true;

    }
  public static void main(String[] args){

    
    System.out.println(count("1234"));
     
    
  }
}
