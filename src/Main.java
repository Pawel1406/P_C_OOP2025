// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Point p1 = new Point();

       p1.setX(5);
       p1.setY(6);
        p1.translate(400,500);
        System.out.println(p1);
        Point p2=p1.translated(237,0);
        System.out.println(p2);
    }
}