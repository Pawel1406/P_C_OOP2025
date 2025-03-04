// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Point p1 = new Point();

       p1.setX(5);
       p1.setY(6);
       Point p2=new Point(7,8);
       Segment odc=new Segment(p1,p2);
       Segment s=new Segment(p1,p2);
     p1.setX(20);
     p1.setY(10);
     p2.translate(20,40);
    }
}