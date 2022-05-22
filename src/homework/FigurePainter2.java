package homework;

public class FigurePainter2 {

    public static void main(String[] args) {
        System.out.println("figure 1");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            for (int j = 5; j > i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("figure 2");
        for (int i = 0; i < 5; i++) {
            for (int j = 4; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int k = 0; k < 5; k++) {
            for (int x = 0; x <= k; x++) {
                System.out.print(" ");
            }
            for (int y = 4; y > k; y--) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }
}
