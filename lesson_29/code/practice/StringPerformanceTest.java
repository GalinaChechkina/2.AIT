package practice;

public class StringPerformanceTest {
    private static final int N=100000;
    private static final String WORD= "Word";

    public static void main(String[] args) {
        String str="";      // назначили пустую строку
        long t1=System.currentTimeMillis();  //засекаем время
        for (int i = 0; i < N; i++) {
            str=str+ WORD;
        }
        long t2=System.currentTimeMillis();  //вторая засечка времени
        System.out.println(t2-t1);//столько времени прошло в милисекундах

        StringBuilder stringBuilder= new StringBuilder(""); //тоже пустая строка
        t1=System.currentTimeMillis();  //засекаем время
        for (int i = 0; i < N; i++) {
            stringBuilder.append(WORD);
        }
        str= stringBuilder.toString();
        t2=System.currentTimeMillis();
        System.out.println(t2-t1);

    }

}
