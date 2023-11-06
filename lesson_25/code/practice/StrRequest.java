package practice;

import java.util.Scanner;

public class StrRequest {
    public static void main(String[] args) {
        //Напишите программу, которая запрашивает строку от пользователя и затем:
        //-  сообщает сколько слов в строке
        //-  сообщает сколько букв (символов) в строке
        //-  печатает строку задом наперед, начиная с последнего слова.

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the string:");
        String st=scanner.nextLine();
        String[]arr=st.split(" ");
        System.out.println("The string consist of "+arr.length+" words");
        String[]arr1=st.split("");
        System.out.println("The string consist of "+arr1.length+" symbols");
        for (int i = arr.length-1; i >=0; i--) {
            System.out.print(arr[i]+" ");
        }
    }
}
