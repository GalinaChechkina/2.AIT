package practice.io_stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ByteInputAppl {
    public static void main(String[] args) throws FileNotFoundException {

        FileInputStream fin1 = new FileInputStream("./dest/data.txt"); //создаем папку dest, в которую поместим файл data.txt
        try {
//            System.out.println("Available: "+fin.available());
//
//            int a = fin.read(); //каждое чтение файла перемещает внутренний курсор- это и считает .available()
//            System.out.println(a);
//            System.out.println("Available: "+fin.available());
//
//             a = fin.read();
//            System.out.println(a);
//            System.out.println("Available: "+fin.available());

//            int a = fin.read();//считали из файла все значения (1)
//            while (a!=-1){
//                System.out.println(a);
//            System.out.println("Available: "+fin.available());
//            a= fin.read();
//            }

//            int length= fin.available(); //считали из файла все значения (2)
//            for (int i = 0; i < length; i++) {
//                int a =fin.read();
//                System.out.println(a);
//            }

              int length1= fin1.available(); //считали из файла все значения (3)
              byte[]arr1=new byte[length1];
              fin1.read(arr1);
            for (byte b:arr1) {
                System.out.println(b);
            }

        } catch (IOException e){
            throw new RuntimeException(e);
        }

        FileInputStream fin2 = new FileInputStream("./dest/data0.txt");
        try {
            int length2= fin2.available();
            byte[]arr2=new byte[length2];
            fin2.read(arr2);
            for (byte b:arr2) {
                System.out.println(b);
            }

        } catch (IOException e){
            throw new RuntimeException(e);
        }
    }
}
