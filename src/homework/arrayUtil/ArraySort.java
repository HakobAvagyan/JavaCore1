package homework.arrayUtil;

public class ArraySort {

    public static void main(String[] args) {
        int[] numbers = {44, 52, 5, 0, 11, 4, -3, 83};
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 1; j < numbers.length - i; j++) {
                if (numbers[j] < numbers[j - 1]) {
                    int tmp = numbers[j];
                    numbers[j] = numbers[j - 1];
                    numbers[j - 1] = tmp;

                }

            }


        }
        for (int x : numbers) {
            System.out.print(x + " ");
        }
        System.out.println();
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 1; j < numbers.length - i; j++) {
                if (numbers[j] > numbers[j - 1]) {
                    int tmp = numbers[j];
                    numbers[j] = numbers[j - 1];
                    numbers[j - 1] = tmp;

                }

            }


        }
        for (int x : numbers) {
            System.out.print(x + " ");
        }


    }

}
