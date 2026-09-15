public class Task385 {

    public static int sumArray(int[] array, int index) {

        if (index == array.length) {
            return 0;
        }

        return array[index] + sumArray(array, index + 1);
    }

    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40};

        System.out.println(sumArray(numbers, 0));
    }
}
