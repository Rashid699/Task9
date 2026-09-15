public class Task386 {

    public static int findMax(int[] array, int index) {

        if (index == array.length - 1) {
            return array[index];
        }

        int maxOfRest = findMax(array, index + 1);

        if (array[index] > maxOfRest) {
            return array[index];
        } else {
            return maxOfRest;
        }
    }

    public static void main(String[] args) {

        int[] numbers = {3, 7, 2, 9, 4};

        System.out.println(findMax(numbers, 0));
    }
}
