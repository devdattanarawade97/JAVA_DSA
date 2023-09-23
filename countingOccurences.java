public class countingOccurences {

    public static int countOccurance(String givenString, String givenChar) {

        int count = 0;
        for (int i = 0; i < givenString.length(); i++) {

            if (givenChar.equals(String.valueOf(givenString.charAt(i)))) {

                count++;
            }
        }

        return count;

    }

    public static void main(String[] args) {

        System.out.println(countOccurance("abcda", "a"));
    }
}
