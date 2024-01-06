package practice.recursion;

public class NewtonSqR {
    public static void main(String[] args) {
        double r=sqrt2(64);
        System.out.println(r);
        double r1=sqrt1(64);
        System.out.println("----------");
        System.out.println(r1);
    }
    public static double sqrt1(double x){
        if(x<0){
            throw new IllegalArgumentException("Нельзя вычислить корень из отрицательного числа!");
        }
        double res=x; //начальное предположение
        double eps=1e-15;//точность
        while (Math.abs(res*res-x)>eps*res){
            res=0.5*(res+x/res);
        }
        return res;
    }
    public static double sqrt2(double n){
        return sqrtRecursive(n,n/2);//новое приближение
    }

    private static double sqrtRecursive(double n, double guess) {
        double newGuess=(guess+n/guess)/2;//вычислили новое приближение
        System.out.println(newGuess);
        if(Math.abs(newGuess-guess)<0.01){
            return newGuess;
        }
        return sqrtRecursive(n,newGuess);
    }
}
