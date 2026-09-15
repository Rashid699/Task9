public class Task387 {

    public static int countVowels(String text) {

        if (text.isEmpty()) {
            return 0;
        }

        char ch = Character.toLowerCase(text.charAt(0));

        int count = 0;

        if (ch == 'a' ||
                ch == 'e' ||
                ch == 'i' ||
                ch == 'o' ||
                ch == 'u') {

            count = 1;
        }

        return count + countVowels(text.substring(1));
    }

    public static void main(String[] args) {

        System.out.println(countVowels("hello"));
        System.out.println(countVowels("programming"));
        System.out.println(countVowels("sky"));
        System.out.println(countVowels("aeiou"));
    }
}
