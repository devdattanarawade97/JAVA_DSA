package String;

import java.util.ArrayList;
import java.util.List;

public class StringCrud {

    // constructor

    public StringCrud() {

    }

    // create string
    public static String CreateString(String abcd) {

        String x = new String(abcd);
        try {

            // for each loop
            for (char eachChar : abcd.toCharArray()) {
                System.out.println(eachChar);
            }

            // char array
            char[] charList = abcd.toCharArray();
            System.out.println(charList.length);

            // String builder
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("a");
            System.out.println("string builder : " + stringBuilder);


            //string operation with array list 
            List<String> listOfStrings = new ArrayList<>();
            //add into list 
            listOfStrings.add("hello world");
            //size of list
            int sizeOfList = listOfStrings.size();
            System.out.println(sizeOfList);
            //get method on list
            String a = listOfStrings.get(0);
            System.out.println(a);
            // contains over list
            boolean checkPresent = listOfStrings.contains("hello world");
            System.out.println(checkPresent);
            
            //check two strings are anagrams
            
            
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
            System.out.println(e.getMessage());
        }

        return x;
    }

    public static void main(String[] args) {

        // create String
        System.out.println(CreateString("abcd"));

    }

}