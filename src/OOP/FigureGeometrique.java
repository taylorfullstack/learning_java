package OOP;

class SpecializeClassesWithInheritance {
    public static void main(String[] args) {
        FigureGeometrique figure = new FigureGeometrique(0, 0);
        System.out.println(figure.x);
        figure.moveTo(1, 1);
        System.out.println(figure.x);
        Carre carre = new Carre(7, 0, 0);
        System.out.println(carre.getPerimetre());
        carre.moveTo(2, 2);
        System.out.println(carre.x);
    }
}

class FigureGeometrique {
    public int x;
    private int y;

    FigureGeometrique(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void moveTo(int newX, int newY) {
        this.x = newX;
        this.y = newY;
    }
}

class Carre extends FigureGeometrique {
    long cote;

    Carre(long cote, int x, int y) {
        //Appel du constructeur de la classe mère FigureGeometrique
        super(x, y);
        this.cote = cote;
    }

    public long getCote() {
        return cote;
    }

    public long getPerimetre() {
        return 4 * cote;
    }
}
