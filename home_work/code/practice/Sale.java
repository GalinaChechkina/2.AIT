package practice;

public class Sale {
    public static void main(String[] args) {
        double a= 10;
        double b= 20;
        double sa= 10;
        double sb= 20;
        int qa= 2;
        int qb= 1;
        double pa= sale1(a,sa,qa);
        double pb= sale2(b,sb,qb);
        double fp=a*qa+b*qb;
        double p;

        if (pa+pb>100){
            p=(pa+pb)-(pa+pb)/20;
        } else { p=pa+pb;
        }

        double s= (fp-p)/fp*100;

        System.out.println("Thank you for your purchase!  "+p+" euros from you.");
        System.out.println("Your discount was "+s+" %");
    }
    public static double sale1(double a, double sa, int qa){
        double pa= (a-a*sa/100)*qa;
        return pa;
    }

    public static double sale2(double b, double sb, int qb){
        double pb= (b-b*sb/100)*qb;
        return pb;
    }
}
