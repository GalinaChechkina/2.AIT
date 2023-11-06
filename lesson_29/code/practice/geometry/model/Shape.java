package practice.geometry.model;

public abstract class Shape {
//  Создайте абстрактный класс Shape с типом поля double и абстрактными методами calcArea и calcPerimeter.
//  Создать классы Circle, Triangle, Square, расширяющие класс Shape и реализующие абстрактные методы.
//  Напишите класс FigureAppl с методом main. В методе создайте массив фигур. Добавьте в массив два круга,
//  один треугольник и один квадрат. Рассчитайте общую площадь и общий периметр всех фигур из массива фигур.
//  Рассчитайте общую площадь кругов из задачи 2.

    protected double a;

    public Shape(double a) {
        this.a = a;
    }
    public double getA() {
        return a;
    }
    public void setA(double a) {
        this.a = a;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Shape shape = (Shape) object;
        return Double.compare(a, shape.a) == 0;
    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(a);
        return (int) (temp ^ (temp >>> 32));
    }
    public abstract double calcPerimeter();
    public abstract double calcArea();
}
