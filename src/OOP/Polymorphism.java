package OOP;

public class Polymorphism {
    public static void main(String[] args) {

        Animal animal = new Animal();

        Animal dog = new Chien();

        Animal pigeon = new Pigeon();


        dog.deplacer();


    }
}

class Animal {
    void deplacer() {
        System.out.println("Je me déplace");
    }
}

class Chien extends Animal {

    /*
    * //Polymorphisme - redefine the method
    * Here, use parent method, then add another functionality to it
    * so now parent method is called with super.deplacer(), then the rest of the code
    * void deplacer() {
        super.deplacer();
        System.out.println("ouaf ouaf");
    }*/

    //override annotation
    @Override
    void deplacer() {
        System.out.println("Je marche");
    }
}

class Oiseau extends Animal {

    void deplacer() {
        System.out.println("Je vole");
    }

}

class Pigeon extends Oiseau {

    void deplacer() {
        System.out.println("Je vole surtout en ville");
    }

}
