package My;

public class HelloWorld1 {
    static final double PINUM = 3.141529;
    static String randomString = "String to print";

    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println(randomString);
        System.out.println(PINUM);
        System.out.println();

        int integerOne = 22, integerTwo;
        integerTwo = integerOne + 1;
        System.out.println(integerTwo);
        System.out.println();

        byte bigByte = 127;
        short bigShort = 32767;
        int bigInt = 2100000000;
        long bigLong = 9220000000000000000L;
        float bigFloat = 3.14F;
        double bigDouble = 3.14235870394582023458;

        System.out.println(Float.MAX_VALUE);
        System.out.println(Double.MAX_VALUE);
        System.out.println();

        boolean trueOfFalse = true;

        char randomChar = 65;
        char anotherChar = 'A';
        char escapedChars = '\\';
        System.out.println(anotherChar);
        System.out.println(randomChar + 1);
        System.out.println(escapedChars);
        System.out.println();

        String randomString = "I'm a random string";
        String anotherString = "Stuff";
        String andAnoterString = randomString + ' ' + anotherString;
        System.out.println(andAnoterString);
        System.out.println();

        String byteString = Byte.toString(bigByte);
        String shortString = Short.toString(bigShort);
        String intString = Integer.toString(bigInt);
        String longString = Long.toString(bigLong);
        String floatString = Float.toString(bigFloat);
        String doubleString = Double.toString(bigDouble);
        String booleanString = Boolean.toString(trueOfFalse);

        double aDoubleValue = 3.1423534534;
        int doubleToInt = (int) aDoubleValue;
        System.out.println(doubleToInt);

        aDoubleValue = 3000000000.1423534534;
        doubleToInt = (int) aDoubleValue;
        System.out.println(doubleToInt);
        System.out.println();

        int stringToInt = Integer.parseInt(intString);
        System.out.println(stringToInt);


    }
}
