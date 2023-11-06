package practice.geometry.model;

public class Square extends Shape{
    public Square(double a) {
        super(a);
    }

    @Override
    public double calcPerimeter() {
        double p=0;
        if(a>=0) {
            p = 4 * a;
        }
        return p;
    }

    @Override
    public double calcArea() {
        double s=0;
        if(a>=0) {
            s = Math.pow(a,2);
        }
        return s;
    }
}
