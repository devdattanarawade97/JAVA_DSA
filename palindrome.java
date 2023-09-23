public class palindrome {
    

    public static String find(String x) {
        

        String y = "";
        for (int i = x.length()-1; i >= 0; i--) {

            y = y + x.charAt(i);

        }
        return y;

    }


    public static void main(String[] args) {
        

        String x = "madam";
        String y = find(x);

        if (x.equals(y)) {
            System.out.println(true);
        }
        else {
            System.out.println(false);
         }
     
    }
}
