package practice.try_catch;

import java.util.Scanner;

public class TryCatchAppl {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        try{
            System.out.println("Input first number: ");
            int a= scanner.nextInt();
            System.out.println("Input second number: ");
            int b= scanner.nextInt();
            int res= a/b;
            System.out.println("Division "+a+"/"+b+" = "+res);
        } catch (Exception e){
            System.out.println(e.getMessage()+", внимание! на ноль делить нельзя! "+e.getCause());//добавили сообщение, содержащее причину ошибки
        }

        int[]arr={1,0,-5,78,-34,0};
        System.out.println(arr.length);

        try {
            arr[9]=157;
        } catch (Exception e){
            System.out.println(e.getMessage()+", "+e.toString());
        }

        try {
            System.out.println("Input number ");
            int n= scanner.nextInt();
            System.out.println("Your input: "+n);
        } catch (Exception e){
            System.out.println(e.toString()+", Input numbers only");
        }
    }
}
