package value_vs_reference;

public class ValueORreference {
    public static void main(String[] args) {
        //TYPE VALUEURS

        String nom1 = "Jean";
        String nom2 = nom1;

        afficheNom(nom1);
        afficheNom(nom2);

        nom1 = "Laurent";

        afficheNom(nom1);
        afficheNom(nom2);

        //TYPE REFERENCES

        Personne personne1 = new Personne("Yoann");
        Personne personne2 = personne1;

        afficheNom(personne1.nom);
        afficheNom(personne2.nom);

        personne1.nom = "Claude";

        afficheNom(personne1.nom);
        afficheNom(personne2.nom);

    }

    static void afficheNom(String text) {
        System.out.println(STR. "-> \{ text } " );
    }


}

class Personne {
    String nom;

    Personne(String nom) {
        this.nom = nom;
    }
}
