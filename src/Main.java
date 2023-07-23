public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle(3);

        circle.calculatePerimeter();
        System.out.println();

        circle.calculateArea();
        System.out.println();


            Triangle triangle = new Triangle( 2,3,3);

            triangle.calculateArea();
            System.out.println();
            triangle.calculatePerimeter();



    }
}