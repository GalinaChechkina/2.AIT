package practice;

public class Maximum {
    public static void main(Stroka[] args) {
        int a=23;
        int b=200;
        int c=30;
        int max= maximum(a,b);
        int maxi= maxim(a,b,c);
        int ost= ostatok(a,b);
        if (ost==0){System.out.println("Divided entirely!");
        } else {
            System.out.println("Not completely divided:(");
        }
        System.out.println("Maximum is "+ max);
        System.out.println("Maxim is "+ maxi);


    }
    public static int maximum(int a, int b){
        int max=0;
        if (a>=b){
            max = a;
        } else {
            max=b;
        }
        return max;
    }

    public static int maxim(int a, int b, int c){
        int maxi=0;
        if (a>=b && a>=c){
            maxi= a;
        }
        if (b>a && b>c){
            maxi= b;
        }
        if (c>a && c>b){
            maxi= c;
        }
        return maxi;
    }

    public static int ostatok(int a, int b){
       int ost=0;
        if (a>=b){
            ost= a%b;
        } else {
            ost= b%a;
        }
        return ost;
    }
}
