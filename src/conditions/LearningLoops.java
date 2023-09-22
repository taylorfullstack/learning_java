package conditions;

public class LearningLoops {
    public static void main(String[] args) {

        /* for loop */
        for (int i = 0; i <= 4; i++) {
            System.out.println(i);
        }

        int[] myArray = new int[]{7, 2, 4};

        /* for each */
        for (int j : myArray) {
            System.out.println(j);
        }

        /* while */
        int numberOfTrees = 0;
        String treeType = "oak";
        double treeHeight = 5.2;
        while (numberOfTrees < 10) {
            numberOfTrees += 1;
            System.out.printf("I planted %d %s trees with an average height of %.1f meters%n", numberOfTrees, treeType, treeHeight);
        }

        System.out.println("I have a forest!");

        // Boucle "While"
        int pushUpGoal = 0;

        while (pushUpGoal > 0) {
            System.out.println("Push up!");
            pushUpGoal -= 1;
        }
        // "do/while"

        do {
            System.out.println("Do a push up!");
            pushUpGoal -= 1;
        } while (pushUpGoal > 0);

        for (int i = 0; i < 10; i++) {
            // déclarations exécutées à chaque itération
            if (i == 2 || i == 5) {
                continue;
            }
            System.out.println("Valeur de i : " + i + ".");
        }

        int[] basket = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        for (int i = 0; i < basket.length; i++) {
            if (basket[i] == 30) {
                System.out.println("J’ai trouvé mon  " + basket[i] + " !");
                break;
            }
            System.out.println("J’en suis à " + basket[i] + " ...");
        }

        int loopLimit = 101;
        int iterations = 0;
        for (int i = 5; i < loopLimit; i++) {
            iterations += 1;
            System.out.println("J’en suis à " + iterations + " ...");
        }

        int numberOfCups = 0;
        do {
            System.out.println("I'm feeling sleepy");
            numberOfCups += 1;
            String myString = STR. "My name is what, my name is: \{ numberOfCups }" ;
            System.out.println(myString);
            System.out.println(STR. "I drank \{ numberOfCups } cups of coffee" );
        } while (numberOfCups < 10);
        System.out.println("I'm feeling awake now!");
    }


}
