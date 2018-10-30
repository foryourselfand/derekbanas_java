package Derek.L7;

public class Lesson7 {

    public static void main(String[] args) {

        // You create an object using the blueprint of this class as follows
        // className objectName = new className();

        Monster frank = new Monster();

        // Since the objects name is public you can change it directly

        frank.name = "Frank";

        // You retrieve class field values by listing the objectName.fieldName
        // You execute class methods by listing objectName.methodName()

        System.out.println(frank.name + " has an attack value of " + frank.getAttack());

    }
}