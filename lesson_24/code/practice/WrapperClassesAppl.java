package practice;

import practice.book.model.Dictionary;

public class WrapperClassesAppl {
    public static void main(String[] args) {
        //количество цифр в числе: узнали длину строки
        Integer x= 9876830;
        String st= x.toString();
        int l= st.length();
        System.out.println("Number of digits in "+x+" is "+l);
        System.out.println(x.MAX_VALUE);
        Double y= 32456.78;
        String st1= y.toString();
        System.out.println("Number of digits in "+y+" is "+st1.length());

        //присвоение и вычисление
        int n=20;
        Integer m= 10;
        System.out.println("n = "+n);
        System.out.println("m = "+m);
        m=m+n;
        System.out.println("m+n = "+m);
        Double pi=3.14;
        double circleLength= 2*pi*10;
        System.out.println("Circle Length is "+circleLength);
        System.out.printf("Circle Length is %.2f", circleLength);
        System.out.println();

        //константы классов-оберток
        System.out.println("------------ Constants of Wrapper Classes ");
        System.out.println("Integer MAX " +Integer.MAX_VALUE);
        System.out.println("Integer MIN " +Integer.MIN_VALUE);
        System.out.println("Long MAX " +Long.MAX_VALUE);
        System.out.println("Long MIN " +Long.MIN_VALUE);
        System.out.println("Double MAX " +Double.MAX_VALUE);
        System.out.println("Double MIN " +Double.MIN_VALUE);

        //обработка деления на ноль
        System.out.println("------Not-aNumber (NaN)-------");
        double a=20.0/0;
        if (Double.isInfinite(a) ||Double.isNaN(a)){
            System.out.println("Wrong operation op wrong result!");
        } else {
            System.out.println(a);
        }

        //перевод String в number
        System.out.println("Parsing String to number");
        String str2= "056735873";
        int num= Integer.parseInt(str2);
        System.out.println("String "+str2+" = "+num);
        String str3="2.7118281828";
        double exp=Double.parseDouble(str3);
        System.out.println("String "+str3+" = "+exp);
    }
}
