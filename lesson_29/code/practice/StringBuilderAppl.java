package practice;

public class StringBuilderAppl {
    public static void main(String[] args) {


        String str = "Java";
        str=str.concat("_").concat("11");
       // str=str.concat(""+11);//добавили пустую строку и целое число 11
        System.out.println(str);

        //StringBuilder
       StringBuilder stringBuilder=new StringBuilder("Java");
       stringBuilder.append("_"+11+"gala"+12+1986).append(11).reverse();
        System.out.println(stringBuilder);
        stringBuilder.reverse();
        System.out.println(stringBuilder);
        str=stringBuilder.toString();
        System.out.println(str);

    }
}
