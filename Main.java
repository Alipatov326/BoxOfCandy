import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Candy[][] box1 = new Candy[4][3];

        box1[0][1] = new Candy("lime");
        box1[1][1] = new Candy("orange");
        box1[2][2] = new Candy("cherry");
        box1[3][1] = new Candy("lemon");
        box1[3][2] = new Candy("grape");

        BoxOfCandy b1 = new BoxOfCandy(box1);
        System.out.println(b1);

        Candy[][] box2= new Candy[3][5];

        box2[0][0] = new Candy("lime");
        box2[0][1] = new Candy("lime");
        box2[0][3] = new Candy("lemon");
        box2[1][0] = new Candy("orange");
        box2[1][3] = new Candy("lime");
        box2[1][4] = new Candy("lime");
        box2[2][0] = new Candy("cherry");
        box2[2][2] = new Candy("lemon");
        box2[0][4] = new Candy("orange");

        BoxOfCandy b = new BoxOfCandy(box2);
        System.out.println(b);

        System.out.println(b.removeNextByFlavor("cherry"));
        System.out.println(b);
    }
}
