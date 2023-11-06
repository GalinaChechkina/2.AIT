package practice.string;

public class StringEqualsAppl {
    public static void main(String[] args) {
        String str1="Hallo";
        String str2=new String("Hallo");
        System.out.println(str1);
        System.out.println(str2);
        boolean checker = str1==str2;//.equals(str2);
        System.out.println(checker);
        boolean checker1 = str1.equals(str2);
        System.out.println(checker1);

    }
}
