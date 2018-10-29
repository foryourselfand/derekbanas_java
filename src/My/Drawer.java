package My;

import static My.Control.arr;

public class Drawer {
    public static final char FILLER = '*';

    public static void fillArray() {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = FILLER;
            }
        }
    }

    public static void showArray() {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print("|" + arr[i][j] + "|");
            }
            System.out.println();
        }

        for (int i = 0; i < 30; i++)
            System.out.print('-');
        System.out.println();
    }
}
