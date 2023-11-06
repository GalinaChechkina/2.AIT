package practice;

public class SeurchNodAppl {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        SeurchNod nod=new SeurchNod();
        System.out.println(nod.nod(a, b));
    }
}
