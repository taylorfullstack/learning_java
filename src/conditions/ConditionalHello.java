package conditions;

/**Ce programme affiche
 * - un message Hello personnalisé si un argument a été envoyé lors de l'exécution du programme
 * - le message traditionnel "Hello World!" si ce n'est pas le cas
 * @author L'équipe Éducation d'OpenClassrooms
 */

public class ConditionalHello {

    /** Le programme commence ici
     * @param args arguments envoyé avec la ligne de commande
     */

    public static void main(String[] args) {
        if (args.length==1) {
            sayHelloTo(args[0]);
        } else if (args.length==2) {
            sayHelloTo(args[0] + " and " + args[1]);
        } else if (args.length==3) {
            sayHelloTo(args[0] + " , " + args[1] + " and " + args[2]);
        } else {
            sayHelloTo("world");
        }

        switch(args.length) {
            case 0: // aucun argument n'a été envoyé
                sayHelloTo("world");
                break;
            case 1: // l'utilisateur a fourni un argument dans le terminal
                sayHelloTo(args[0]);
                break;
            case 2: // l'utilisateur a fourni 2 arguments
                sayHelloTo(args[0] + " and " + args[1]);
                break;
            default: // l'utilisateur a fourni plus d'arguments qu'on peut en gérer !
                System.out.println("Sorry, I don't know how to manage more than 2 names!");
        }

    }

    /** affiche le message hello au destinataire fourni
     * @param recipient
     */
    private static void sayHelloTo(String recipient) {
        System.out.println("Hello " + recipient + "!");
    }

    static void printBoolean(){
        if(getBoolean()){
            console("if");
        } else {
            console("else");
        }
    }

    static void console(String text){
        System.out.println("Condition :" + text);
    }

    static boolean getBoolean(){
        return false;
    }

}
