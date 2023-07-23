public class Circle extends  Shape {
    private final  double P = 3.14 ;
    private double R;

    public Circle(double r) {
        R = r;
    }

    @Override
    public void calculateArea() {
        double s = P * (R * R);
        System.out.println(s);
    }

    @Override
    public void calculatePerimeter() {
        double c = 2 * P * R;
        System.out.println(c);
    }

    public double getR() {
        return R;
    }

    public void setR(double r) {
        R = r;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "P=" + P +
                ", R=" + R +
                '}';
    }
}
