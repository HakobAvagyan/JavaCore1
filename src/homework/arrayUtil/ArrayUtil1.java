package homework.arrayUtil;

public class ArrayUtil1 {
    int max(int[] array) {
        int Maxvalue = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > Maxvalue) {
                Maxvalue = array[i];
            }
        }
        return Maxvalue;
    }

    int min(int[] array) {
        int Minvalue = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < Minvalue) {
                Minvalue = array[i];
            }

        }
        return Minvalue;
    }

    void even(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + " ");

            }
        }

    }

    void odd(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 1) {
                System.out.print(array[i] + " ");
            }
        }

    }

    int EvenCounts(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                count++;
            }
        }

        return count;
    }

    int OddCounts(int[] array) {
        int count1 = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                count1++;
            }
        }

        return count1;
    }

    void y(int array[]) {
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            result = result + array[i];
        }
        System.out.println(+result/10);

    }

    void z(int array[]) {
        int result1 = 0;
        for (int i = 0; i < array.length; i++) {
            result1 = result1 + array[i];
        }
        System.out.println(+result1);

    }

    void sort(int numbers[]) {
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
    }

    void sort1(int numbers[]) {

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
