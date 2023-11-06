package practice.geometry.model;

public class FigureAppl {
    public static void main(String[] args) {
        Shape[]shapes= new Shape[4];
        shapes[0]=new Circle(1);
        shapes[1]=new Circle(10);
        shapes[2]=new Triangle(2);
        shapes[3]=new Square(3);
        double per=totalPerimeter(shapes);
        System.out.println(per);
        double s=totalArea(shapes);
        System.out.println(s);

        Circle[] circles=new Circle[2];
        circles[0]=new Circle(1);
        circles[1]=new Circle(10);
        double s1=totalArea(circles);
        System.out.println(s1);

        double s2=totalCirArea(shapes);
        System.out.println(s2);
    }

    public static double totalPerimeter(Shape[]shapes){
        double res=0;
        for (int i = 0; i < shapes.length; i++) {
            res+=shapes[i].calcPerimeter();
        }
        return res;
    }

    public static double totalArea(Shape[]shapes){
        double res=0;
        for (int i = 0; i < shapes.length; i++) {
            res+=shapes[i].calcArea();
        }
        return res;
    }

    public static double totalCirArea(Shape[]shapes){
        double res=0;
        for (int i = 0; i < shapes.length; i++) {
            if (shapes[i] instanceof Circle) {
                res += shapes[i].calcArea();
            }
        }
        return res;
    }
}
