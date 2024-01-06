package practice.file_copy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyPicAppl {
    public static void main(String[] args) {

        //мы копируем файл: из какого в какой задаем с помощью командной строки args

        if (args.length!=2){//если не указали какой-то из файлов, то ошибка
            System.out.println("Wrong number of arguments!");
        }
        System.out.println("Source: "+args[0]);//иначе выводим в консоль что копируем
        System.out.println("Destination: "+args[1]);//куда копируем

        //передаем файл для чтения в args[0]
        try (FileInputStream fin=new FileInputStream(args[0])) {

            //передаем файл для записи в args[1]
            FileOutputStream fout=new FileOutputStream(args[1]);

            int a= fin.read(); //читаем по bit
            while (a!=-1){
                fout.write(a); //пишем по bit
                a= fin.read();
            }
        }  catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
