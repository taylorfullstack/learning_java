package lambdas;


public class MainLambda {
    public static void main(String[] args) {
        Etudiant et = () -> System.out.println("Toto");
        et.donnerNom();//Affichera Toto

        EtudiantEvolue ete = (leNomAafficher) -> System.out.println("Je me nomme " + leNomAafficher);
        ete.donnerNom("Jean");//Cette fois, on affichera Jean
    }

    //Votre interface “fonctionnelle”
    public interface Etudiant {
        void donnerNom();
    }

    public interface EtudiantEvolue {
        void donnerNom(String nom);
    }
}
//Utilisation
