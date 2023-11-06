package practice;

import java.lang.reflect.Array;
import java.util.Arrays;

public class StringAppl {
    public static void main(String[] args) {
        ArrayMethods.split();
        String str= "Hello";
        char[]chars={32, 'w','o','r','l','d','!'};
        String str1= new String(chars);
        System.out.println(str1);
        /*str=str+str1;
        System.out.println(str); операция, аналогичная concat*/
        str=str.concat(str1);                //конкастинация
        System.out.println(str);
        int l=str.length();
        System.out.println("Length of string "+str+" is "+l);
        char c= str.charAt(str.length()-1);  //определяем последний символ в строке
        System.out.println("Last symbol of string: "+c);
        ArrayMethods.split();
        System.out.println("Print by letters: ");
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println();
        ArrayMethods.split();
        String str2=" World!";
        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str2));
        String str3= str1.toUpperCase();
        System.out.println(str3);
        str3.toLowerCase();
        System.out.println(str3.toLowerCase());
        ArrayMethods.split();
        //позиция символа в строке (индекс)
        int index=str.indexOf('d');
        System.out.println("Index of symbol d is "+index);
        index=str.indexOf("or");
        System.out.println(index);
        index=str.indexOf('o',5);
        System.out.println(index);
        index=str.lastIndexOf('l');
        System.out.println(index);
        index=str.indexOf('a');
        System.out.println(index);
        ArrayMethods.split();
        System.out.println(str.substring(3));
        System.out.println(str.substring(1,8));
        System.out.println(str.replace("o","o-o-o"));
        ArrayMethods.split();
        String str4="     Billy     ";
        str4=str4.trim();
        System.out.println(str4);
        String str5="I love String in Java!!!";
        String[]words=str5.split(" ");
        System.out.println("Quantity of words in string: "+words.length);
        System.out.println(Arrays.toString(words));
        ArrayMethods.split();
        String str6= "Я помню чудное мгновеньe...";
        String[]letters=str6.split("");
        System.out.println(Arrays.toString(letters));
    }
}
