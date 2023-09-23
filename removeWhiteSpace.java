public class removeWhiteSpace {
    

    public static String removeSpace(String x) {
        
        String y = x.replace(" ", "");
        return y;
    }


    public static void main(String[] args) {
        

        String x = "Install the latest PowerShell for new features and improvements";
    System.out.println(removeSpace(x));
    }

  
}
