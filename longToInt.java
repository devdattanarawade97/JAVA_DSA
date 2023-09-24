public class longToInt {
    // Converting long into int: Write a program that converts long into int.

    public static int convertToInt(long givenNumber) {

        int result = (int) givenNumber;

        return result;
    }

    public static double convertToDouble(int givenNumber) {

        double result = (double) givenNumber;

        return result;
    }

    public static void main(String[] args) {

        System.out.println(convertToInt(2000L));
        System.out.println(convertToDouble(200));
    }
}
