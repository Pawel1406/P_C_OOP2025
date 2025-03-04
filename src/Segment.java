public class Segment {
    private Point pkt1;
    private Point pkt2;

    public Point getPkt1() {
        return pkt1;
    }

    public void setPkt1(Point pkt1) {
        this.pkt1 = pkt1;
    }

    public Point getPkt2() {
        return pkt2;
    }

    public void setPkt2(Point pkt2) {
        this.pkt2 = pkt2;
    }

    public Segment(Point pkt1, Point pkt2) {
        this.pkt1 = pkt1;
        this.pkt2 = pkt2;
    }

    public Segment() {}

    @Override
    public String toString() {
        return "Segment{" +"\n"+
                "\t" +"pkt1=" + pkt1 +",\n"+
                 "\t" +"pkt2=" + pkt2 + "\n"+
                '}';
    }
}
