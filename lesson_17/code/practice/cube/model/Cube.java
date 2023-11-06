package practice.cube.model;

public class Cube {
    // Создать класс Cube, описывающий куб cо стороной a.
    // Реализовать в нем методы определения периметра p (сумма длин всех ребер),
    // площади s (сумма площадей всех граней) и объема v. Создать приложение CubeAppl,
    // в котором создать несколько экземпляров класса Cube.
    // Для каждого экземпляра вызвать методы класса Cube и рассчитать p, s и v.

    int side;

    public Cube(int side) {
        this.side = side;
    }
    public int getSide() {
        return side;
    }
    public void setSide(int side) {
        this.side = side;
    }

    public void display(){
        System.out.println("Cube with side "+side);}

    public int perimeter(int a){
        int p=a*12;
        return p;
    }
    public int square(int a){
        int s=a*a*6;
        return s;
    }
    public int volume(int a) {
        int v = a * a * a;
        return v;
    }
    public static void split(){
        System.out.println("-----------------------------");
    }
}
