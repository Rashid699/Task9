public class Task377 {


    public static int countDigits(int number) {

        if (number < 10) {
            return 1;
        }

        return 1 + countDigits(number / 10);
    }

    public static void main(String[] args) {

        System.out.println(countDigits(7));
        System.out.println(countDigits(45));
        System.out.println(countDigits(1000));
        System.out.println(countDigits(999999));
    }
}
