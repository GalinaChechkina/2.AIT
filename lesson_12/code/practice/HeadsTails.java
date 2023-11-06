package practice;

public class HeadsTails {
    public static void main(String[] args)  {
        //Подбросьте монетку 100 раз. Сколько раз выпала решка? Сколько орел?
        // Сравните итоговые вероятности выпадения орла и решки.

        double a=0;
        double b=0;
        double p1;
        double p2;
        int[]arr= new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * (1 - 0 + 1) + 0);
            if (arr[i]==1){
                a++;
            } else {
                b++;
            }
        }
        p1=a/100;
        p2=b/100;
        System.out.println("Heads came up  "+a+"  times");
        System.out.println("Tails came up  "+b+"  times");
        System.out.println("Probability of getting heads is  "+p1);
        System.out.println("Probability of getting tails is  "+p2);
    }
}
