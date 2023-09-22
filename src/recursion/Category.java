package recursion;

import java.util.ArrayList;

class Categories extends ArrayList<Category> {

}

public class Category {

    public int numberOfBooks;

    public Categories subCategories = new Categories();

}
