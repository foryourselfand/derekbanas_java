package L8;

import java.util.Arrays;

// Basic class definition
// public means this class can be used by other classes
// Class names should begin with a capital letter
// A file can't contain two public classes. It can contain classes that are not public
// If you place class files in the same folder the java compiler will be able to find them

public class Monster {

    public static int numOfMonsters = 0;
    static char[][] battleBoard = new char[10][10];
    public final String TOMBSTONE = "Here Lies a Dead monster";

    // Class Variables or Fields
    // You declare constants with final
    // public variables are visible outside of the class
    // You should have as few as possible public fields
    public String name = "Big Monster";
    public char nameChar1 = 'B';
    public int xPosition = 0;
    public int yPosition = 0;
    // private fields are not visible outside of the class
    private int health = 500;
    private int attack = 20;
    private int movement = 2;
    private boolean alive = true;
    public Monster(int health, int attack, int movement, String name) {
        this.health = health;
        this.attack = attack;
        this.movement = movement;
        this.name = name;
        /* If the attributes had the same names as the class health, attack, movement
         * You could refer to the objects fields by proceeding them with this
         * this.health = health;
         * this.attack = attack;
         * objectFieldName = attributeFieldName;
         */

        int maxXBoardSpace = battleBoard.length - 1;
        int maxYBoardSpace = battleBoard[0].length - 1;

        int randNumX, randNumY;

        do {

            randNumX = (int) (Math.random() * maxXBoardSpace);
            randNumY = (int) (Math.random() * maxYBoardSpace);

        } while (battleBoard[randNumX][randNumY] != '*');

        this.xPosition = randNumX;
        this.yPosition = randNumY;

        this.nameChar1 = name.charAt(0);

        battleBoard[this.yPosition][this.xPosition] = this.nameChar1;

        numOfMonsters++;

    }
    public Monster() {
        numOfMonsters++;
    }

    // Class Methods
    // Accessor Methods are used to get and set the values of private fields

    public static void buildBattleBoard() {

        for (char[] row : battleBoard) {

            Arrays.fill(row, '*');

        }

    }

    public static void redrawBoard() {

        int k = 1;
        while (k <= 30) {
            System.out.print('-');
            k++;
        }
        System.out.println();

        for (int i = 0; i < battleBoard.length; i++) {

            for (int j = 0; j < battleBoard[i].length; j++) {

                System.out.print("|" + battleBoard[i][j] + "|");

            }
            System.out.println();

        }
        k = 1;
        while (k <= 30) {
            System.out.print('-');
            k++;
        }
        System.out.println();


    }

    public int getAttack() {
        return attack;
    }

    public int getMovement() {
        return movement;
    }

    // You can create multiple versions using the same method name
    // Now setHealth can except an attack that contains decimals
    // When overloading a method you can't just change the return type
    // Focus on creating methods that except different parameters

    public int getHealth() {
        return health;
    }

    public void setHealth(double decreaseHealth) {
        int intDecreaseHealth = (int) decreaseHealth;
        health = health - intDecreaseHealth;
        if (health < 0) {
            alive = false;
        }
    }

    /* The Constructor
     * Code that is executed when an object is created from this class definition
     * The method name is the same as the class
     * The constructor is only executed once per object
     * The constructor can't return a value
     */

    public boolean getAlive() {
        return alive;
    }

    // You can overload constructors like any other method
    // The following constructor is the one provided by default if you don't create any other constructors
    // Default Constructor

    public void setHealth(int decreaseHealth) {
        health = health - decreaseHealth;
        if (health < 0) {
            alive = false;
        }
    }

}
