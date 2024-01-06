package practice;

import java.io.*;

public class ConsoleIOAppl {
    public static void main(String[] args) throws IOException {

        //подготовим объект, который будет читать с консоли имя файла

        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter file name: ");
        String str= br.readLine();
        //System.out.println(str);

        // обратимся к конструктору файловой системы FileWriter,
        // чтобы создать новый объект для записи файла(создаем символьный поток в файл)
        // c true будет идти сохранение того, что было записано ранее ( т.е. дозапись, а не перезапись

        PrintWriter pw= new PrintWriter(new FileWriter(str,true));
        System.out.println("Type the text here: ");
        str =br.readLine();
        while (!"stop".equalsIgnoreCase(str)){
            pw.println(str);
            System.out.println("Type the text here: ");
            str=br.readLine();
        }
        pw.flush(); // отправление из буфера в поток
        pw.close();
    }
}
