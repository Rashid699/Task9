public class Task379 {

    public static int length(String text) {

        if (text.isEmpty()) {
            return 0;
        }

        return 1 + length(text.substring(1));
    }

    public static void main(String[] args) {

        System.out.println(length("cat"));
        System.out.println(length("hello"));
        System.out.println(length(""));
        System.out.println(length("a"));
    }
}
