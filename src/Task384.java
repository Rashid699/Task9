public class Task384 {

    public static int countChar(String text, char target) {

        if (text.isEmpty()) {
            return 0;
        }

        if (text.charAt(0) == target) {
            return 1 + countChar(text.substring(1), target);
        }

        return countChar(text.substring(1), target);
    }

    public static void main(String[] args) {

        System.out.println(countChar("banana", 'a'));
        System.out.println(countChar("hello", 'l'));
        System.out.println(countChar("apple", 'z'));
        System.out.println(countChar("mississippi", 's'));
    }
}
