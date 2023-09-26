public class stringDelimiter {

    public static StringBuilder delimit(String[] givenString) {

        StringBuilder builder = new StringBuilder();
        for (String string : givenString) {

            builder.append(string);
        }

        return builder;
    }

    public static void main(String[] args) {

        String[] values = { "abcd", "cdef", "ghijkl" };
        System.out.println(delimit(values));
    }
}
