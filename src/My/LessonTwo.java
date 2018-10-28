package My;

import java.util.Scanner;

public class LessonTwo {
    static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Your favorite number: ");

        if (userInput.hasNextInt()) {
            int num = userInput.nextInt();

            System.out.println("You Entered " + num);

            int numTimes2 = num + num;
            System.out.println(num + " + " + num + " = " + numTimes2);

            int numMinus2 = num - 2;
            System.out.println(num + " - 2 = " + numMinus2);

            int numTimesSelf = num * num;
            System.out.println(num + " * " + num + " = " + numTimesSelf);

            int numDividedTwo = num / 2;
            System.out.println(num + " / 2 = " + numDividedTwo);

            int numRemainderTwo = num % 2;
            System.out.println(num + " % 2 = " + numRemainderTwo);

            //Теперь переписывать уже очевидное не буду

        } else {
            System.out.println("Enter an integer next time");
        }
    }
}
