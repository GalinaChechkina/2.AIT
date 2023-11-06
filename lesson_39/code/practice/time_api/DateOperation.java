package practice.time_api;
    // В классе DateOperation реализовать метод getAge,
    // принимающий дату рождения в виде String, и возвращающий возраст в годах.
    // В классе DateOperation реализовать метод sortStringDates,
    // принимающий массив дат в виде массива данных типа String, и возвращающий отсортированный массив дат.
    // Для проверки используйте класс DateOperationTest с Unit-тестами.


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;

public class DateOperation {
    public static long getAge(String birthDate) {
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("[dd:MM:yyyy][yyyy MM dd][dd.MM.yyyy][dd MM yyyy][dd/MM/yyyy][yyyy-MM-dd]");
        LocalDate date =LocalDate.parse(birthDate,formatter);
        System.out.println("Your birthday is "+date);
        LocalDate currentDate = LocalDate.now();
        System.out.println("Today is "+currentDate);
        long age = ChronoUnit.YEARS.between(date, currentDate);
        System.out.println("Your age is "+age);
        int res = (int) age;
        return res;
    }

    public static String[] sortStringDates(String[] dates) {
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("[dd:MM:yyyy][dd.MM.yyyy][yyyy MM dd][dd MM yyyy][dd/MM/yyyy][yyyy-MM-dd]");
        LocalDate[]dates1=new LocalDate[dates.length];
        for (int i = 0; i < dates.length; i++) {
            dates1[i]= LocalDate.parse(dates[i],formatter);
        }
        Arrays.sort(dates1);
        String []dates2=new String[dates.length];
        for (int i = 0; i < dates2.length; i++) {
            dates2[i]=dates1[i].format(DateTimeFormatter.ISO_DATE);
        }
        return dates2;
    }
}
