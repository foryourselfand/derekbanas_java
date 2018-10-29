package My;

public class Control {
    public static char[][] arr;
    private Monster[] monsters;

    public Control() {
        arr = new char[10][10];
        Drawer.fillArray();

        monsters = new Monster[4];
    }

    public void startGame() {
        char[] names = new char[]{'A', 'B', 'C', 'D'};
        for (int i = 0; i < monsters.length; i++) {

            monsters[i] = new Monster(names[i]);
        }

        fillMonsters();
        Drawer.showArray();
    }

    private void fillMonsters() {
        for (Monster tempMonster : monsters)
            fillMonster(tempMonster);
    }

    private void fillMonster(Monster tempMonster) {
        arr[tempMonster.getX()][tempMonster.getY()] = tempMonster.getName();
    }
}
