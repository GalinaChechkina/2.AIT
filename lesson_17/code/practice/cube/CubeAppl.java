package practice.cube;

import practice.cube.model.Cube;

public class CubeAppl {
    public static void main(String[] args) {
        Cube c1=new Cube(10);
        Cube c2=new Cube(20);
        Cube c3=new Cube(30);

        c1.display();
        c2.display();
        c3.display();
        Cube.split();
        int p= c1.perimeter(c1.getSide());
        System.out.println("Perimeter of a cube with side "+c1.getSide()+" is "+p);
        int s= c2.square(c2.getSide());
        System.out.println("Square of a cube with side "+c2.getSide()+" is "+s);
        int v= c3.volume(c3.getSide());
        System.out.println("Volume of a cube with side "+c3.getSide()+" is "+v);
        Cube.split();
    }
}
