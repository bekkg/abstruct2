public class Triangle extends Shape{
    private int a ;
    private  int b ;
     private  int c;

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public void calculateArea() {
        double p = (a + b + c ) /2d;
        double s = p * ( p - a ) * (p - b ) * (p - c);
        System.out.println(Math.sqrt(s));

    }

    @Override
    public void calculatePerimeter() {

        double p = getA() + getB() + getC();
        System.out.println(p);
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}
