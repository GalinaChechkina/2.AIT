package practice;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class EmployeeDataAppl {
    public static void main(String[] args) {

        //хотим считать данные из файла employee
        try (BufferedReader br = new BufferedReader(new FileReader("./dest/employee.csv"))) {
            String str= br.readLine();
            //System.out.println(str);
            String[]cells=str.split(",");//,-разделитель в нашем массиве

            printCells(cells);

            double salary=0;
            int counter=0;
            int age=0;

            str= br.readLine();
            while (str!=null) {
                counter++;
                cells = str.split(",");
                salary += Double.parseDouble(cells[2]);//перервели нашу зарплату в Double из строки
                LocalDate bd = LocalDate.parse(cells[3]);//считали дату как строку
                age += ChronoUnit.YEARS.between(bd, LocalDate.now());
                printCells(cells);
                str = br.readLine();
            }
                System.out.println("Total employees: "+counter);
                System.out.println("Total salary: "+salary);
                System.out.println("Average salary: "+salary/counter);
                System.out.println("Average age: "+age/counter);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void printCells(String[] cells) {
        for (int i = 0; i < cells.length; i++) {
            System.out.print(cells[i]+"\t");//используем табуляцию
        }
        System.out.println();
    }
}
