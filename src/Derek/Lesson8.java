package Derek;
// Basic class definition
// public means this class can be used by other classes
// Class names should begin with a capital letter
// A file can't contain two public classes. It can contain classes that are not public
// If you place class files in the same folder the java compiler will be able to find them

/* The Goal of this tutorial is to make a game like this
------------------------------
|*||*||*||*||*||*||*||*||*||*|
|*||*||*||*||*||*||*||*||*||*|
|*||*||*||*||*||*||*||*||*||*|
|*||M||F||*||*||*||*||*||*||*|
|*||*||*||*||*||*||*||*||*||*|
|*||*||*||*||*||*||*||*||*||*|
|*||*||*||*||*||*||*||*||*||*|
|P||*||*||*||*||*||*||*||*||*|
|*||*||*||*||D||*||*||*||*||*|
|*||*||*||*||*||*||*||*||*||*|
------------------------------
[9,9]

 */
public class Lesson8 {
    public static void main(String[] args) {

        Lesson8Monster.buildBattleBoard();

        char[][] tempBattleBoard = new char[10][10];

        // ObjectName[] ArrayName = new ObjectName[4];

        Lesson8Monster[] monsters = new Lesson8Monster[4];

        // Lesson8Monster(int health, int attack, int movement, String name)

        monsters[0] = new Lesson8Monster(1000, 20, 1, "Frank");
        monsters[1] = new Lesson8Monster(500, 40, 2, "Drake");
        monsters[2] = new Lesson8Monster(1000, 20, 1, "Paul");
        monsters[3] = new Lesson8Monster(1000, 20, 1, "George");

        Lesson8Monster.redrawBoard();

    }

}
