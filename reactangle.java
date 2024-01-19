public class reactangle extends Shape {
    

    

    

    @Override
    void changeColor(String x) {
        // TODO Auto-generated method stub
        System.out.println(x);

    }
    

    public static void main(String[] args) {
        
        reactangle rc = new reactangle();
        rc.changeColor("abcd");
    }
}
