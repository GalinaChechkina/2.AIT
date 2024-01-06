package homework;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class Titanic {
    public static void main(String[] args) {
        // Подсчитайте общую стоимость проезда (выручка от рейса).+
        // Задание 2. Посчитайте средний тариф для 1,2,3 классов путешествия.+
        // Задание 3. Подсчитайте общее количество выживших и погибших пассажиров.+
        // Задание 4. Подсчитайте общее количество выживших и погибших мужчин,
        // женщин и детей (до 18 лет).

        // хотим считать данные из файла titanic

        try (BufferedReader br = new BufferedReader(new FileReader("./dest/titanic.csv"))) {
            String str= br.readLine();

            String[]cells=str.split(",");// ","-разделитель в нашем массиве
            printCells(cells); // проба пера

            double fare=0;
            double fare1=0;
            double fare2=0;
            double fare3=0;

            int counter=0;
            int counter1=0;
            int counter2=0;
            int counter3=0;
            int countTot1=0;
            int countTot2=0;
            int countTot3=0;
            int countSur1=0;
            int countSur2=0;
            int countSur3=0;

            str= br.readLine();
            while (str!=null) {
                counter++; // хочу посчитать пассажиров
                cells = str.split(",");
                if (cells[6].equals("")){
                    cells[6]="18";
                }
                fare += Double.parseDouble(cells[10]); // перервели цену билета в Double из строки

                if(cells[2].equals("1")){ // считаем среднюю стоимость билета в первый класс
                    fare1+=Double.parseDouble(cells[10]);
                    counter1++;
                }
                if(cells[2].equals("2")){ // считаем среднюю стоимость билета во второй класс
                    fare2+=Double.parseDouble(cells[10]);
                    counter2++;
                }
                if(cells[2].equals("3")) { // считаем среднюю стоимость билета в третий класс
                    fare3 += Double.parseDouble(cells[10]);
                    counter3++;
                }

                //погибшие мужчины
                if(cells[1].equals("0") && cells[5].equals("male") && cells[6].compareTo("18")>=0){
                    countTot1++;
                }

                //погибшие женщины
                if (cells[1].equals("0") && cells[5].equals("female") && cells[6].compareTo("18")>=0){
                    countTot2++;
                }

                //погибшие дети
                if (cells[1].equals("0") && cells[6].compareTo("18")<0){
                    countTot3++;
                }

                //выжившие мужчины
                if(cells[1].equals("1") && cells[5].equals("male")&& cells[6].compareTo("18")>=0){
                    countSur1++;
                }

                //выжившие женщины
                if(cells[1].equals("1") && cells[5].equals("female")&& cells[6].compareTo("18")>=0){
                    countSur2++;
                }

                //выжившие дети
                if (cells[1].equals("1") && cells[6].compareTo("18")<0){
                    countSur3++;
                }
                str = br.readLine();
        }
            System.out.printf("Total fare:  %.2f", fare);
            System.out.println();
            System.out.printf("Average fare для 1 класса:  %.2f", fare1/counter1);
            System.out.println();
            System.out.printf("Average fare для 2 класса:  %.2f", fare2/counter2);
            System.out.println();
            System.out.printf("Average fare для 3 класса:  %.2f", fare3/counter3);
            System.out.println();
            System.out.println("Всего пассажиров: "+counter);
            System.out.println("Количество погибших: "+(countTot1+countTot2+countTot3));
            System.out.println("Количество погибших мужчин: "+countTot1);
            System.out.println("Количество погибших женщин: "+countTot2);
            System.out.println("Количество погибших детей: "+countTot3);
            System.out.println("Количество выживших: "+(countSur1+countSur2+countSur3));
            System.out.println("Количество выживших мужчин: "+countSur1);
            System.out.println("Количество выживших женщин: "+countSur2);
            System.out.println("Количество выживших детей: "+countSur3);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    private static void printCells(String[] cells) {
        for (int i = 0; i < cells.length; i++) {
            System.out.print(cells[i]+"\t"); // используем табуляцию
        }
        System.out.println();
    }
}
