package OOP;


public class PhoneInfo {

    /**
     * Le programme commence ici
     */
    public static void main(String[] args) {


        Marque apple = new Marque("apple");

        Telephone iphone = new Telephone(34000, "iphone", apple);
        iphone.pixels += 5;

        System.out.println(iphone.pixels);
    }

}

class Telephone {
    int pixels;
    String nom;
    Marque marque;

    public Telephone(int pixels, String nom, Marque marque) {
        this.pixels = pixels;
        this.nom = nom;
        this.marque = marque;
    }

}

class Marque {
    String nom;

    public Marque(String nom) {
        this.nom = nom;
    }
}

