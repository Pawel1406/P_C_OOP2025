import java.util.ArrayList;

public class Polygon {
    private ArrayList<String> points;
    points.add("s");

    public Polygon(ArrayList<String> points) {
        this.points = points;
    }

    @Override
    public String toString() {
        return "Polygon{" +
                "points=" + points +
                '}';
    }
}
