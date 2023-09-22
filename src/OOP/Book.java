package OOP;

public class Book {

    String title;

    String author;

    int numberOfPages;


    String publisher;

    //Constructeur secondaire de la classe Book
    Book(String title, String author, int numberOfPages) {

        //Utilise le constructeur principal avec des valeur prédéfinies
        this(title, author, numberOfPages, "OC");
    }

    //Constructeur de la classe Book
    Book(String title, String author, int numberOfPages, String publisher) {
        //Initialise l’attribut title avec la valeur de l’argument title
        this.title = title;
        this.author = author;
        this.numberOfPages = numberOfPages;
        this.publisher = publisher;
    }


}