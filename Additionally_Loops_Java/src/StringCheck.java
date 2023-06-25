public class StringCheck {
    public static void main(String[] args) {
        String phrase = "I love java";
        boolean containsPhrase = checkString(phrase);
        System.out.println(containsPhrase);
    }

    public static boolean checkString(String input) {
        String targetPhrase = "I love java";
        return input.contains(targetPhrase);
    }
}