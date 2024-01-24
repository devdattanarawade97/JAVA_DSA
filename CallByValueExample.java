public class CallByValueExample {
    public static void main(String[] args) {
        int x = 5;
        System.out.println("Before: x = " + x);
        modifyValue(x);
        System.out.println("After: x = " + x);
    }

    static void modifyValue(int value) {
        value = 10;
        System.out.println("Inside method: value = " + value);
    }
}
