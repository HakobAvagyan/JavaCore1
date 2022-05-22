package homework;

public class CharArrayExample {

    public static void main(String[] args) {
        char[] chars = {'j', 'a', 'v', 'a', 'l', 'o', 'v', 'e'};
        int count = 0;
        char c = 'o';
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == c) {
                count++;
            }
        }
        System.out.print(count);
        System.out.println();
        char[] chars2 = {'j', 'a', 'v', 'a', 'l', 'o', 'v', 'e'};
        System.out.print(chars2[chars2.length / 2]);
        System.out.print(chars2[chars2.length / 2 - 1]);
        System.out.println();
        char[] chars3 = {'j', 'a', 'v', 'a', 'l', 'o', 'l', 'y'};
        if (chars3[chars3.length - 1] == 'y' && chars3[chars3.length - 2] == 'l') {
            System.out.print("\'ly\':true");
        } else {
            System.out.print("\'ly\' :false");
        }
        System.out.println();
        char[] bobArray = {'b', 'a', 'b', 'o', 'l', 'a',};
        boolean bob = false;
        for (int i = 0; i < bobArray.length; i++) {
            if (bobArray[i] == 'b' && bobArray[i + 2] == 'b') {
                bob = true;
            }
        }
        System.out.print(bob);
        System.out.println();
        char[] text = {' ', ' ', 'b', 'a', 'r', 'e', 'v', ' ', ' '};
        for (int i = 0; i < text.length; i++) {
            if (text[i] != ' ') {
                System.out.print(text[i]);
            }
        }
    }
}
