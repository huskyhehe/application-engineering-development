public class Main {
    public static void main(String[] args) {

        Triangle t1 = new Triangle(8.0);
        Triangle t2 = new Triangle("Triangle", "pink", 6.0);
        Parallelogram p1 = new Parallelogram(8.5,4.8,6.0);
        Parallelogram p2 = new Parallelogram("Parallelogram", "white", 11.0,12.0,9.0);

        t1.printShape();
        t2.printShape();
        p1.printShape();
        p2.printShape();
    }
}
