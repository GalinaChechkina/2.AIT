package practice;

public class Power3 {
    public static void main(Stroka[] args) {
        System.out.println("1 3 in power 0");
        int count=1;
        int res=1;
        while (count<=10){
         res=3*res;
            System.out.println(res + " 3 in power" + count);
            count++;
        }
    }
}
