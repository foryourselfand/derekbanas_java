package My;

import static My.Control.arr;

public class Monster {
    private char name;
    private int x, y;

    public Monster(char name) {
        this.name = name;
        getRandomCords();
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public char getName() {
        return name;
    }

    private void getRandomCords() {
        int tempX, tempY;

        do {
            tempX = (int) (Math.random() * arr.length);
            tempY = (int) (Math.random() * arr[0].length);

        } while (arr[tempX][tempY] != Drawer.FILLER);

        this.x = tempX;
        this.y = tempY;
    }
}
