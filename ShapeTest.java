/**
 * Created by Sasha on 09.08.2016.
 */
public class ShapeTest {

    public static void main(String[] args) {
        Shape shape1 = new Circle();
        Shape shape2 = new Triangle();
        testPoly(shape1);
        testPoly(shape2);
    }

    public static void testPoly(Shape shape) {
        shape.draw();
        shape.rotate();
    }
}
