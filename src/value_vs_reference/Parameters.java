package value_vs_reference;

public class Parameters {


    public static void main(String[] args) {
        displayPerimeter(10, 11); // -> 42
        displayPerimeter(2, 2); // -> 8
        int sumOfSmallNumbers = sum(3, 7);
        System.out.println(sumOfSmallNumbers); // -> 10
        int sumOfLargerNumbers = sum(sumOfSmallNumbers, 999);
        System.out.println(sumOfLargerNumbers); // -> 1009


        //Types valeur
        // Déclarez la variable "a" en tant que "int" et l'initialiser avec une valeur de 10
        int a = 10;
        // Déclarez la variable "b" en tant que "int" et l'initialiser avec une copie de la valeur de "a"
        int b = a;
        System.out.println(a); // -> 10
        System.out.println(b); // -> 10
        a = 15;
        System.out.println(a); // -> 15
        System.out.println(b); // -> 10

        //Types de référence (pointeurs)

        Car car = new Car();
        Car carToPaint = car;
        System.out.println(car.color); // -> red
        System.out.println(carToPaint.color); // -> red
        carToPaint.color = "yellow";
        System.out.println(car.color); // -> yellow
        System.out.println(carToPaint.color); // -> yellow
        paint(car, "green");
        System.out.println(car.color); // -> green


    }


    public static void displayPerimeter(int length, int width) {
        int perimeter = 2 * (length + width);
        System.out.println(perimeter);
        //La valeur affichée dépend de la longueur (length) et la largeur (width)
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static void paint(Car car, String color) {
        car.color = color;
    }


    public static class Car {
        String color = "red";
    }


}

