package practice.geometry.model;

public class Circle extends Shape{
    public Circle(double a) {
        super(a);
    }
    @Override
    public double calcPerimeter() {
        double l=0;
        if(a>=0){
        l=2*a*Math.PI;
        }
        return l;
    }

    @Override
    public double calcArea() {
        double s=0;
        if(a>=0) {
            s = Math.PI * Math.pow(a, 2);
        }
        return s;
    }
}
