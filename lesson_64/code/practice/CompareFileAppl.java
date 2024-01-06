package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CompareFileAppl {
    public static void main(String[] args) {

        // В классе CompareFileAppl реализовать логику сравнения двух файлов в методе main.
        // Имена файлов принимать через массив args. Два файла считаем одинаковыми,
        // если у них одинаковая длина, и на тех же позициях стоят те же байты.
        // Результат должен быть выведен на консоль в виде сообщения.

        if (args.length < 2) {
            System.out.println("Wrong Input.");
        } else {
            System.out.println("Source: " + args[0]);
            System.out.println("Destination: " + args[1]);

            //передаем файлы 1 и 2 для чтения в args[0] и args[1]:

            try (FileInputStream fin1 = new FileInputStream(args[0])) {
                FileInputStream fin2 = new FileInputStream(args[1]);
                int l1 = fin1.available();
                byte[] arr1 = new byte[l1];
                fin1.read(arr1);
                for (byte b : arr1) {
                    System.out.print(b + " ");
                }
                System.out.println();

                int l2 = fin2.available();
                byte[] arr2 = new byte[l2];
                fin2.read(arr2);
                for (byte b : arr2) {
                    System.out.print(b + " ");
                }
                System.out.println();

                if (l1 != l2) {
                    System.out.println("These files are not equals.");
                } else {
                    int res = 0;
                    for (int i = 0; i < l1; i++) {
                        res += (arr1[i] - arr2[i]);
                    }
                    System.out.println(res);
                    if (res ==0) {
                        System.out.println("These files are equals.");
                    } else {
                        System.out.println("These files are not equals.");
                    }
                }

                } catch(FileNotFoundException e) {
                    throw new RuntimeException(e);
                } catch(IOException e) {
                    throw new RuntimeException(e);
                }
        }
    }
}






