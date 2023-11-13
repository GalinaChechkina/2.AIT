package practice.mystring;

import java.util.Iterator;

public class MyStringAppl {
    public static void main(String[] args) {
        StringBuilder str= new StringBuilder("Lisa Mona");
        MyString myString= new MyString(str);

        Iterator<Character>iterator= myString.iterator();
        while (iterator.hasNext()){
            char c= iterator.next();
            if(c=='a'){
                iterator.remove();
            }
        }
        System.out.println(myString);

        /*myString.addChar('!');
        System.out.println(myString);

        myString.removeChar('i');
        System.out.println(myString);

        StringBuilder builder=myString.getStr();
        for (int i = 0; i < builder.length(); i++) {
            char c=builder.charAt(i);
            c= Character.toUpperCase(c);
            System.out.print(c);
        }

        System.out.println();
        builder.setLength(5);
        System.out.println(builder);
        System.out.println(myString);*/
    }
}
