package casestudy.com.hardik;

public class Main {

    public static void main(String[] args) {

        Circle circle = new Circle();

        circle.readShapeData();
        System.out.println(circle);

        Rectangle rectangle = new Rectangle();
        rectangle.readShapeData();
        System.out.println(rectangle);

        RightAngledTriangle angledTriangle = new RightAngledTriangle();
        angledTriangle.readShapeData();
        System.out.println(angledTriangle);

    }
}
