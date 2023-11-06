package practice;

public class StrAppl {
    public static void main(String[] args) {
 // Дана строка "I'm proud to learn Java! Java is the most famous programming language!!!"
 // Выполнить практикум с этой строкой:
 //   -распечатать последний символ строки.
 //   -найти позицию подстроки “Java” в строке.
 //   -проверить, содержит ли заданная строка подстроку “Java”.
 //   -заменить все символы “o” на “a”.
 //   -преобразуйте строку к верхнему регистру.
 //   -преобразуйте строку к нижнему регистру.
 //   -вырезать подстроку Java c помощью метода substring().
 //   -проверить, заканчивается ли строка подстрокой “!!!”.
 //   -проверить, начинается ли строка подстрокой “I'm proud”.

        String str= "I'm proud to learn Java! Java is the most famous programming language!!!";
        System.out.println(str);
        ArrayMethods.split();
        System.out.println("Last symbol is "+str.charAt(str.length()-1));
        System.out.println("The position Java is "+str.indexOf("Java"));
        String s="Java";
        String st=str.substring(str.indexOf("Java"),str.indexOf("Java")+4);
        boolean isSt=s.equals(st);
        System.out.println(isSt);
        ArrayMethods.split();

        System.out.println("Change (o) to (a): "+str.replace('o','a'));
        System.out.println("Uppercase string: "+str.toUpperCase());
        System.out.println("Lowercase string: "+str.toLowerCase());
        ArrayMethods.split();
        System.out.println("Cut out the substring: "+str.substring(19,23));
        ArrayMethods.split();
        String str1="!!!";
        String str2=str.substring(str.length()-3,str.length());
        boolean isStr= str1.equals(str2);
        System.out.println(isStr);
        ArrayMethods.split();
        System.out.println(str);
        String str3="I'm proud";
        String str4=str.substring(0,9);
        boolean isStr1= str3.equals(str4);
        System.out.println(isStr1);

    }
}
