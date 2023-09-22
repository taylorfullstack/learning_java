package collectionsAndArrays;

import java.util.*;

public class Collections {

    // Définissez des clés en tant que constantes dans votre classe
    private static final String KJENNY = "Jenny";
    private static final String KLIVIA = "Livia";
    private static final String KHENRY = "Henry";

    public static void main(String[] args) {


        Map<String, Integer> constMap = new HashMap<String, Integer>();
// Utilisez des constantes en tant que keys
        constMap.put(KJENNY, 34);
        constMap.put(KLIVIA, 28);
        constMap.put(KHENRY, 31);

// Accédez à un élément
        System.out.println(constMap.get(KJENNY)); // -> 34


        //String Array List

        List<String> myList = new ArrayList<String>();
        myList.add("cat");
        myList.add("dog");
        myList.add("bird");

        System.out.println(myList);

        myList.addFirst("fish");
        System.out.println(myList);

        myList.set(3, "oiseux");
        System.out.println(myList);

        myList.remove(2);
        System.out.println(myList);

        System.out.println(myList.size());

        //Integer Array List

        List<Integer> myNumbersList = new ArrayList<Integer>();
        myNumbersList.add(7);
        myNumbersList.add(5);
        System.out.println(myNumbersList);

        myNumbersList.add(1, 12);
        System.out.println(myNumbersList);
        myNumbersList.set(0, 4);
        System.out.println(myNumbersList);
        myNumbersList.remove(1);
        System.out.println(myNumbersList);
        System.out.println(myNumbersList.size());

        //Sets / ensembles
        Set<String> ingredients = new HashSet<>();
        ingredients.add("salt"); //ajoutez du sel sur les ingrédients
        System.out.println(ingredients.contains("salt"));
        ingredients.remove("salt"); //enlevez du sel des ingrédients
        System.out.println(ingredients.contains("salt"));
        System.out.println(ingredients.size());

        //Maps / dictionnaires
        Map<String, Integer> myMap = new HashMap<String, Integer>();

        // Les âges de mes amis

        //CREATE
        myMap.put("Onix", 34);
        myMap.put("Saphir", 28);
        myMap.put("Citrine", 31);

        //READ
        System.out.println(myMap.get("Onix")); // -> 34

        //UPDATE
        myMap.put("Onix", 33);
        System.out.println(myMap.get("Onix"));

        //DELETE
        myMap.remove("Onix");
        System.out.println(myMap.get("Onix"));

    }
}
