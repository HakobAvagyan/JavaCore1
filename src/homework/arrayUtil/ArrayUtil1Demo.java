package homework.arrayUtil;

public class ArrayUtil1Demo {

    public static void main(String[] args) {
        int[] numbers = {1, 4, 7, 13, 16, 25, 34, 38, 18, 63};
        ArrayUtil1 x = new ArrayUtil1();
        System.out.println(" max = " + x.max(numbers));
        System.out.println(" min = " + x.min(numbers));
        x.even(numbers);
        System.out.println();
        x.odd(numbers);
        System.out.println();
        System.out.println( x.EvenCounts(numbers));
        System.out.println(x.OddCounts(numbers));
        x.y(numbers);
        x.z(numbers);
        x.sort(numbers);
        x.sort1(numbers);

    }

}
