public class concanateString {
    // Concatenating the same string n times: Write a program that concatenates the
    // same string a given number of times.

    public static String concate(String givenString, int numberOfTimes) {

        String resultantString = "";
        for (int i = 0; i < numberOfTimes; i++) {
            resultantString = resultantString + givenString;
        }

        return resultantString;
    }

    public static void main(String[] args) {

   System.out.println(concate("abcd", 10));
    }
}
