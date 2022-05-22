package homework;

public class ArrayUtil {

    public static void main(String[] args) {

        int[] array = {8, 6,107, 13, 16, 25, 34, 38, 18, 63};


        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        int maxValue = array[0];
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxValue) {
                maxValue = array[i];
            }
        }
        System.out.println("max value : " + maxValue);

        int minValue = array[0];
        for (int i = 0; i < array.length; i++) {
            if (minValue > array[i]) {
                minValue = array[i];
            }
        }
        System.out.println("min value : " + minValue);


        System.out.print("even numbers are: ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();

        System.out.print("odd numbers are: ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 1) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                count++;
            }
        }
        System.out.print(count + " ");
        System.out.println();
        int z = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 1) {
                z++;
            }
        }
        System.out.print(z + " ");
        System.out.println();
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            result = result + array[i];
        }
        System.out.print(+result / 10);
        System.out.println();

        int x = 0;
        for (int i = 0; i < array.length; i++) {
            x = x + array[i];
        }
        System.out.print(+x);


    }


}
