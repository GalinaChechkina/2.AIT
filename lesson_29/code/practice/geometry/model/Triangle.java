package practice.geometry.model;

public class Triangle extends Shape{

    public Triangle(double a) {
        super(a);
    }

    @Override
    public double calcPerimeter() {
        double p=0;
        if(a>=0){
            p=3*a;
        }
        return p;
    }

    @Override
    public double calcArea() {
        double s=0;
        if(a>=0){
            s=Math.pow(a,2)*Math.sqrt(3)/4;
        }
        return s;
    }
}
