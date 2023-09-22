package quiz2;

public class Quiz2 {
    public static int transform(int a, int b) {
        int x = a + b;
        int y = x * 2;
        return y;
    }

    public static void main(String[] args) {
        int x = 1;
        int y = 10;
        x = transform(x, y);
        y = transform(y, x);
        System.out.println(x);
        System.out.println(y);


        int k = 11;
        int t = 16;
        if (k == t) {
            System.out.println("k et t sont identiques");
        } else if (k + 3 == t - 2) {
            System.out.println("k et t sont différents mais nous pouvons ajuster");
        } else {
            System.out.println("k et t sont très différents");
        }
    }
}
