package collectionsAndArrays;

public class Arrays {
    public static void main(String[] args) {
        //Déclarez une variable nommée colors qui correspond à un tableau de String de longueur 5
        //Remplissez le tableau avec les couleurs demandées

        String[] colors = new String[]{"red", "yellow", "orange", "green", "blue"};

        //Remplacez 'green' par 'emerald' dans le tableau

        colors[3] = "emerald";

        //Affiche le contenu du tableau
        for (String color : colors) {
            System.out.println(color);
        }

        System.out.println(colors.length);

        // Créez un tableau multidimensionnel pour gérer tous les rangs d'un théâtre
        String[][] myTheatreSeats = new String[30][12];

        // Rang 10, siège 6. N'oubliez pas que l'index commence à 0!
        myTheatreSeats[9][5] = "James Logan";

        System.out.println(myTheatreSeats[9][5]);


    }
}
